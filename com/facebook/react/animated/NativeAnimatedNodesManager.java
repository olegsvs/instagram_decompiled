package com.facebook.react.animated;

import X.AnonymousClass0Df;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIImplementation;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.UIManagerModule.CustomEventNamesResolver;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;

public final class NativeAnimatedNodesManager implements EventDispatcherListener {
    private final SparseArray mActiveAnimations = new SparseArray();
    private int mAnimatedGraphBFSColor = 0;
    private final SparseArray mAnimatedNodes = new SparseArray();
    private final CustomEventNamesResolver mCustomEventNamesResolver;
    private final Map mEventDrivers = new HashMap();
    private final List mRunUpdateNodeList = new LinkedList();
    private final UIImplementation mUIImplementation;
    private final SparseArray mUpdatedNodes = new SparseArray();

    public NativeAnimatedNodesManager(UIManagerModule uIManagerModule) {
        this.mUIImplementation = uIManagerModule.getUIImplementation();
        uIManagerModule.getEventDispatcher().addListener(this);
        this.mCustomEventNamesResolver = uIManagerModule.getDirectEventNamesResolver();
    }

    public final void addAnimatedEventToView(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt("animatedValueTag");
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i2);
        StringBuilder stringBuilder;
        if (animatedNode == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node with tag ");
            stringBuilder.append(i2);
            stringBuilder.append(" does not exists");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        } else if (animatedNode instanceof ValueAnimatedNode) {
            ReadableArray array = readableMap.getArray("nativeEventPath");
            List arrayList = new ArrayList(array.size());
            for (int i3 = 0; i3 < array.size(); i3++) {
                arrayList.add(array.getString(i3));
            }
            EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList, (ValueAnimatedNode) animatedNode);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(i);
            stringBuilder2.append(str);
            String stringBuilder3 = stringBuilder2.toString();
            if (this.mEventDrivers.containsKey(stringBuilder3)) {
                ((List) this.mEventDrivers.get(stringBuilder3)).add(eventAnimationDriver);
                return;
            }
            List arrayList2 = new ArrayList(1);
            arrayList2.add(eventAnimationDriver);
            this.mEventDrivers.put(stringBuilder3, arrayList2);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node connected to event should beof type ");
            stringBuilder.append(ValueAnimatedNode.class.getName());
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
    }

    public final void connectAnimatedNodeToView(int i, int i2) {
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i);
        StringBuilder stringBuilder;
        if (animatedNode == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" does not exists");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        } else if (animatedNode instanceof PropsAnimatedNode) {
            ((PropsAnimatedNode) animatedNode).connectToView(i2);
            this.mUpdatedNodes.put(i, animatedNode);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node connected to view should beof type ");
            stringBuilder.append(PropsAnimatedNode.class.getName());
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
    }

    public final void connectAnimatedNodes(int i, int i2) {
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i);
        if (animatedNode != null) {
            AnimatedNode animatedNode2 = (AnimatedNode) this.mAnimatedNodes.get(i2);
            if (animatedNode2 != null) {
                animatedNode.addChild(animatedNode2);
                this.mUpdatedNodes.put(i2, animatedNode2);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node with tag ");
            stringBuilder.append(i2);
            stringBuilder.append(" does not exists");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Animated node with tag ");
        stringBuilder.append(i);
        stringBuilder.append(" does not exists");
        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    }

    public final void createAnimatedNode(int i, ReadableMap readableMap) {
        if (this.mAnimatedNodes.get(i) == null) {
            AnimatedNode styleAnimatedNode;
            String string = readableMap.getString("type");
            if ("style".equals(string)) {
                styleAnimatedNode = new StyleAnimatedNode(readableMap, this);
            } else if ("value".equals(string)) {
                styleAnimatedNode = new ValueAnimatedNode(readableMap);
            } else if ("props".equals(string)) {
                styleAnimatedNode = new PropsAnimatedNode(readableMap, this, this.mUIImplementation);
            } else if ("interpolation".equals(string)) {
                styleAnimatedNode = new InterpolationAnimatedNode(readableMap);
            } else if ("addition".equals(string)) {
                styleAnimatedNode = new AdditionAnimatedNode(readableMap, this);
            } else if ("subtraction".equals(string)) {
                styleAnimatedNode = new SubtractionAnimatedNode(readableMap, this);
            } else if ("division".equals(string)) {
                styleAnimatedNode = new DivisionAnimatedNode(readableMap, this);
            } else if ("multiplication".equals(string)) {
                styleAnimatedNode = new MultiplicationAnimatedNode(readableMap, this);
            } else if ("modulus".equals(string)) {
                styleAnimatedNode = new ModulusAnimatedNode(readableMap, this);
            } else if ("diffclamp".equals(string)) {
                styleAnimatedNode = new DiffClampAnimatedNode(readableMap, this);
            } else if ("transform".equals(string)) {
                styleAnimatedNode = new TransformAnimatedNode(readableMap, this);
            } else if ("tracking".equals(string)) {
                styleAnimatedNode = new TrackingAnimatedNode(readableMap, this);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported node type: ");
                stringBuilder.append(string);
                throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
            }
            styleAnimatedNode.mTag = i;
            this.mAnimatedNodes.put(i, styleAnimatedNode);
            this.mUpdatedNodes.put(i, styleAnimatedNode);
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Animated node with tag ");
        stringBuilder.append(i);
        stringBuilder.append(" already exists");
        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    }

    public final void disconnectAnimatedNodeFromView(int i, int i2) {
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i);
        StringBuilder stringBuilder;
        if (animatedNode == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" does not exists");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        } else if (animatedNode instanceof PropsAnimatedNode) {
            ((PropsAnimatedNode) animatedNode).disconnectFromView(i2);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node connected to view should beof type ");
            stringBuilder.append(PropsAnimatedNode.class.getName());
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
    }

    public final void disconnectAnimatedNodes(int i, int i2) {
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i);
        if (animatedNode != null) {
            AnimatedNode animatedNode2 = (AnimatedNode) this.mAnimatedNodes.get(i2);
            if (animatedNode2 != null) {
                animatedNode.removeChild(animatedNode2);
                this.mUpdatedNodes.put(i2, animatedNode2);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node with tag ");
            stringBuilder.append(i2);
            stringBuilder.append(" does not exists");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Animated node with tag ");
        stringBuilder.append(i);
        stringBuilder.append(" does not exists");
        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    }

    public final void dropAnimatedNode(int i) {
        this.mAnimatedNodes.remove(i);
        this.mUpdatedNodes.remove(i);
    }

    public final void extractAnimatedNodeOffset(int i) {
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" does not exists or is not a 'value' node");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
        ((ValueAnimatedNode) animatedNode).extractOffset();
    }

    public final void flattenAnimatedNodeOffset(int i) {
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" does not exists or is not a 'value' node");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
        ((ValueAnimatedNode) animatedNode).flattenOffset();
    }

    public final AnimatedNode getNodeById(int i) {
        return (AnimatedNode) this.mAnimatedNodes.get(i);
    }

    public static void handleEvent(NativeAnimatedNodesManager nativeAnimatedNodesManager, Event event) {
        if (!nativeAnimatedNodesManager.mEventDrivers.isEmpty()) {
            String resolveCustomEventName = nativeAnimatedNodesManager.mCustomEventNamesResolver.resolveCustomEventName(event.getEventName());
            Map map = nativeAnimatedNodesManager.mEventDrivers;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(event.getViewTag());
            stringBuilder.append(resolveCustomEventName);
            List<EventAnimationDriver> list = (List) map.get(stringBuilder.toString());
            if (list != null) {
                for (EventAnimationDriver eventAnimationDriver : list) {
                    nativeAnimatedNodesManager.stopAnimationsForNode(eventAnimationDriver.mValueNode);
                    event.dispatch(eventAnimationDriver);
                    nativeAnimatedNodesManager.mRunUpdateNodeList.add(eventAnimationDriver.mValueNode);
                }
                nativeAnimatedNodesManager.updateNodes(nativeAnimatedNodesManager.mRunUpdateNodeList);
                nativeAnimatedNodesManager.mRunUpdateNodeList.clear();
            }
        }
    }

    public final boolean hasActiveAnimations() {
        if (this.mActiveAnimations.size() <= 0) {
            if (this.mUpdatedNodes.size() <= 0) {
                return false;
            }
        }
        return true;
    }

    public final void onEventDispatch(final Event event) {
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(this, event);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public final void run() {
                    NativeAnimatedNodesManager.handleEvent(NativeAnimatedNodesManager.this, event);
                }
            });
        }
    }

    public final void removeAnimatedEventFromView(int i, String str, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        if (this.mEventDrivers.containsKey(stringBuilder2)) {
            List list = (List) this.mEventDrivers.get(stringBuilder2);
            if (list.size() == 1) {
                Map map = this.mEventDrivers;
                stringBuilder = new StringBuilder();
                stringBuilder.append(i);
                stringBuilder.append(str);
                map.remove(stringBuilder.toString());
                return;
            }
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (((EventAnimationDriver) listIterator.next()).mValueNode.mTag == i2) {
                    listIterator.remove();
                    return;
                }
            }
        }
    }

    public final void restoreDefaultValues(int i, int i2) {
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i);
        if (animatedNode != null) {
            if (animatedNode instanceof PropsAnimatedNode) {
                ((PropsAnimatedNode) animatedNode).restoreDefaultValues();
                return;
            }
            i = new StringBuilder();
            i.append("Animated node connected to view should beof type ");
            i.append(PropsAnimatedNode.class.getName());
            throw new JSApplicationIllegalArgumentException(i.toString());
        }
    }

    public final void runUpdates(long j) {
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < this.mUpdatedNodes.size(); i++) {
            this.mRunUpdateNodeList.add((AnimatedNode) this.mUpdatedNodes.valueAt(i));
        }
        this.mUpdatedNodes.clear();
        Object obj = null;
        for (int i2 = 0; i2 < this.mActiveAnimations.size(); i2++) {
            AnimationDriver animationDriver = (AnimationDriver) this.mActiveAnimations.valueAt(i2);
            animationDriver.runAnimationStep(j);
            this.mRunUpdateNodeList.add(animationDriver.mAnimatedValue);
            if (animationDriver.mHasFinished) {
                obj = 1;
            }
        }
        updateNodes(this.mRunUpdateNodeList);
        this.mRunUpdateNodeList.clear();
        if (obj != null) {
            for (int size = this.mActiveAnimations.size() - 1; size >= 0; size--) {
                AnimationDriver animationDriver2 = (AnimationDriver) this.mActiveAnimations.valueAt(size);
                if (animationDriver2.mHasFinished) {
                    if (animationDriver2.mEndCallback != null) {
                        Arguments.createMap().putBoolean("finished", true);
                        animationDriver2.mEndCallback.invoke(new Object[]{r2});
                    }
                    this.mActiveAnimations.removeAt(size);
                }
            }
        }
    }

    public final void setAnimatedNodeOffset(int i, double d) {
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" does not exists or is not a 'value' node");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
        ((ValueAnimatedNode) animatedNode).mOffset = d;
        this.mUpdatedNodes.put(i, animatedNode);
    }

    public final void setAnimatedNodeValue(int i, double d) {
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" does not exists or is not a 'value' node");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
        stopAnimationsForNode(animatedNode);
        ((ValueAnimatedNode) animatedNode).mValue = d;
        this.mUpdatedNodes.put(i, animatedNode);
    }

    public final void startAnimatingNode(int i, int i2, ReadableMap readableMap, Callback callback) {
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i2);
        StringBuilder stringBuilder;
        if (animatedNode == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node with tag ");
            stringBuilder.append(i2);
            stringBuilder.append(" does not exists");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        } else if (animatedNode instanceof ValueAnimatedNode) {
            AnimationDriver animationDriver = (AnimationDriver) this.mActiveAnimations.get(i);
            if (animationDriver != null) {
                animationDriver.resetConfig(readableMap);
                return;
            }
            AnimationDriver frameBasedAnimationDriver;
            String string = readableMap.getString("type");
            if ("frames".equals(string)) {
                frameBasedAnimationDriver = new FrameBasedAnimationDriver(readableMap);
            } else if ("spring".equals(string)) {
                frameBasedAnimationDriver = new SpringAnimation(readableMap);
            } else if ("decay".equals(string)) {
                frameBasedAnimationDriver = new DecayAnimation(readableMap);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported animation type: ");
                stringBuilder.append(string);
                throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
            }
            frameBasedAnimationDriver.mId = i;
            frameBasedAnimationDriver.mEndCallback = callback;
            frameBasedAnimationDriver.mAnimatedValue = (ValueAnimatedNode) animatedNode;
            this.mActiveAnimations.put(i, frameBasedAnimationDriver);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node should be of type ");
            stringBuilder.append(ValueAnimatedNode.class.getName());
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
    }

    public final void startListeningToAnimatedNodeValue(int i, AnimatedNodeValueListener animatedNodeValueListener) {
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" does not exists or is not a 'value' node");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
        ((ValueAnimatedNode) animatedNode).setValueListener(animatedNodeValueListener);
    }

    public final void stopAnimation(int i) {
        for (int i2 = 0; i2 < this.mActiveAnimations.size(); i2++) {
            AnimationDriver animationDriver = (AnimationDriver) this.mActiveAnimations.valueAt(i2);
            if (animationDriver.mId == i) {
                if (animationDriver.mEndCallback != null) {
                    Arguments.createMap().putBoolean("finished", false);
                    animationDriver.mEndCallback.invoke(new Object[]{r2});
                }
                this.mActiveAnimations.removeAt(i2);
                return;
            }
        }
    }

    private void stopAnimationsForNode(AnimatedNode animatedNode) {
        int i = 0;
        while (i < this.mActiveAnimations.size()) {
            AnimationDriver animationDriver = (AnimationDriver) this.mActiveAnimations.valueAt(i);
            if (animatedNode.equals(animationDriver.mAnimatedValue)) {
                if (animationDriver.mEndCallback != null) {
                    Arguments.createMap().putBoolean("finished", false);
                    animationDriver.mEndCallback.invoke(new Object[]{r2});
                }
                this.mActiveAnimations.removeAt(i);
                i--;
            }
            i++;
        }
    }

    public final void stopListeningToAnimatedNodeValue(int i) {
        AnimatedNode animatedNode = (AnimatedNode) this.mAnimatedNodes.get(i);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Animated node with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" does not exists or is not a 'value' node");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
        ((ValueAnimatedNode) animatedNode).setValueListener(null);
    }

    private void updateNodes(List list) {
        AnimatedNode animatedNode;
        int i;
        int i2 = this.mAnimatedGraphBFSColor + 1;
        this.mAnimatedGraphBFSColor = i2;
        if (i2 == 0) {
            this.mAnimatedGraphBFSColor = 1;
        }
        Queue arrayDeque = new ArrayDeque();
        int i3 = 0;
        for (AnimatedNode animatedNode2 : list) {
            int i4 = animatedNode2.mBFSColor;
            i2 = this.mAnimatedGraphBFSColor;
            if (i4 != i2) {
                animatedNode2.mBFSColor = i2;
                i3++;
                arrayDeque.add(animatedNode2);
            }
        }
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode3 = (AnimatedNode) arrayDeque.poll();
            if (animatedNode3.mChildren != null) {
                for (i = 0; i < animatedNode3.mChildren.size(); i++) {
                    animatedNode2 = (AnimatedNode) animatedNode3.mChildren.get(i);
                    animatedNode2.mActiveIncomingNodes++;
                    i4 = animatedNode2.mBFSColor;
                    i2 = this.mAnimatedGraphBFSColor;
                    if (i4 != i2) {
                        animatedNode2.mBFSColor = i2;
                        i3++;
                        arrayDeque.add(animatedNode2);
                    }
                }
            }
        }
        i2 = this.mAnimatedGraphBFSColor + 1;
        this.mAnimatedGraphBFSColor = i2;
        if (i2 == 0) {
            this.mAnimatedGraphBFSColor = 1;
        }
        i = 0;
        for (AnimatedNode animatedNode22 : list) {
            if (animatedNode22.mActiveIncomingNodes == 0) {
                i4 = animatedNode22.mBFSColor;
                i2 = this.mAnimatedGraphBFSColor;
                if (i4 != i2) {
                    animatedNode22.mBFSColor = i2;
                    i++;
                    arrayDeque.add(animatedNode22);
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode4 = (AnimatedNode) arrayDeque.poll();
            animatedNode4.update();
            if (animatedNode4 instanceof PropsAnimatedNode) {
                try {
                    ((PropsAnimatedNode) animatedNode4).updateView();
                } catch (Throwable e) {
                    AnonymousClass0Df.D("ReactNative", "Native animation workaround, frame lost as result of race condition", e);
                }
            }
            if (animatedNode4 instanceof ValueAnimatedNode) {
                ((ValueAnimatedNode) animatedNode4).onValueUpdate();
            }
            if (animatedNode4.mChildren != null) {
                for (int i5 = 0; i5 < animatedNode4.mChildren.size(); i5++) {
                    animatedNode22 = (AnimatedNode) animatedNode4.mChildren.get(i5);
                    animatedNode22.mActiveIncomingNodes--;
                    if (animatedNode22.mBFSColor != this.mAnimatedGraphBFSColor && animatedNode22.mActiveIncomingNodes == 0) {
                        animatedNode22.mBFSColor = this.mAnimatedGraphBFSColor;
                        i++;
                        arrayDeque.add(animatedNode22);
                    }
                }
            }
        }
        if (i3 != i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Looks like animated nodes graph has cycles, there are ");
            stringBuilder.append(i3);
            stringBuilder.append(" but toposort visited only ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
