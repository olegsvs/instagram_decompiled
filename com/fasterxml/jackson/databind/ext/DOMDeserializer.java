package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public abstract class DOMDeserializer extends FromStringDeserializer {
    private static final DocumentBuilderFactory _parserFactory;
    private static final long serialVersionUID = 1;

    public class DocumentDeserializer extends DOMDeserializer {
        private static final long serialVersionUID = 1;

        public DocumentDeserializer() {
            super(Document.class);
        }

        public Document _deserialize(String str, DeserializationContext deserializationContext) {
            return parse(str);
        }
    }

    public class NodeDeserializer extends DOMDeserializer {
        private static final long serialVersionUID = 1;

        public NodeDeserializer() {
            super(Node.class);
        }

        public Node _deserialize(String str, DeserializationContext deserializationContext) {
            return parse(str);
        }
    }

    public abstract Object _deserialize(String str, DeserializationContext deserializationContext);

    static {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        _parserFactory = newInstance;
        newInstance.setNamespaceAware(true);
    }

    public DOMDeserializer(Class cls) {
        super(cls);
    }

    public final Document parse(String str) {
        try {
            return _parserFactory.newDocumentBuilder().parse(new InputSource(new StringReader(str)));
        } catch (String str2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse JSON String as XML: ");
            stringBuilder.append(str2.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), str2);
        }
    }
}
