package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;
import java.net.URL;

public class JsonFactory implements Versioned, Serializable {
    public static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    public static final int DEFAULT_GENERATOR_FEATURE_FLAGS = com.fasterxml.jackson.core.JsonGenerator.Feature.collectDefaults();
    public static final int DEFAULT_PARSER_FEATURE_FLAGS = com.fasterxml.jackson.core.JsonParser.Feature.collectDefaults();
    private static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    public static final String FORMAT_NAME_JSON = "JSON";
    public static final ThreadLocal _recyclerRef = new ThreadLocal();
    private static final long serialVersionUID = 8726401676402117450L;
    public CharacterEscapes _characterEscapes;
    public int _factoryFeatures;
    public int _generatorFeatures;
    public InputDecorator _inputDecorator;
    public ObjectCodec _objectCodec;
    public OutputDecorator _outputDecorator;
    public int _parserFeatures;
    public final transient BytesToNameCanonicalizer _rootByteSymbols;
    public final transient CharsToNameCanonicalizer _rootCharSymbols;
    public SerializableString _rootValueSeparator;

    public enum Feature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true);
        
        private final boolean _defaultState;

        private Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        public final boolean enabledByDefault() {
            return this._defaultState;
        }

        public final int getMask() {
            return 1 << ordinal();
        }
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public JsonFactory() {
        this((ObjectCodec) null);
    }

    public JsonFactory(JsonFactory jsonFactory, ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._rootByteSymbols = BytesToNameCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
    }

    public JsonFactory(ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._rootByteSymbols = BytesToNameCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
    }

    public void _checkInvalidCopy(Class cls) {
        if (getClass() != cls) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed copy(): ");
            stringBuilder.append(getClass().getName());
            stringBuilder.append(" (version: ");
            stringBuilder.append(version());
            stringBuilder.append(") does not override copy(); it has to");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public IOContext _createContext(Object obj, boolean z) {
        return new IOContext(_getBufferRecycler(), obj, z);
    }

    public JsonGenerator _createGenerator(Writer writer, IOContext iOContext) {
        JsonGenerator writerBasedJsonGenerator = new WriterBasedJsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, writer);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            writerBasedJsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            writerBasedJsonGenerator.setRootValueSeparator(serializableString);
        }
        return writerBasedJsonGenerator;
    }

    public JsonGenerator _createJsonGenerator(Writer writer, IOContext iOContext) {
        return _createGenerator(writer, iOContext);
    }

    public JsonParser _createJsonParser(InputStream inputStream, IOContext iOContext) {
        return _createParser(inputStream, iOContext);
    }

    public JsonParser _createJsonParser(Reader reader, IOContext iOContext) {
        return _createParser(reader, iOContext);
    }

    public JsonParser _createJsonParser(byte[] bArr, int i, int i2, IOContext iOContext) {
        return _createParser(bArr, i, i2, iOContext);
    }

    public JsonParser _createParser(InputStream inputStream, IOContext iOContext) {
        return new ByteSourceJsonBootstrapper(iOContext, inputStream).constructParser(this._parserFeatures, this._objectCodec, this._rootByteSymbols, this._rootCharSymbols, isEnabled(Feature.CANONICALIZE_FIELD_NAMES), isEnabled(Feature.INTERN_FIELD_NAMES));
    }

    public JsonParser _createParser(Reader reader, IOContext iOContext) {
        return new ReaderBasedJsonParser(iOContext, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.makeChild(isEnabled(Feature.CANONICALIZE_FIELD_NAMES), isEnabled(Feature.INTERN_FIELD_NAMES)));
    }

    public JsonParser _createParser(byte[] bArr, int i, int i2, IOContext iOContext) {
        return new ByteSourceJsonBootstrapper(iOContext, bArr, i, i2).constructParser(this._parserFeatures, this._objectCodec, this._rootByteSymbols, this._rootCharSymbols, isEnabled(Feature.CANONICALIZE_FIELD_NAMES), isEnabled(Feature.INTERN_FIELD_NAMES));
    }

    public JsonGenerator _createUTF8Generator(OutputStream outputStream, IOContext iOContext) {
        JsonGenerator uTF8JsonGenerator = new UTF8JsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, outputStream);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            uTF8JsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            uTF8JsonGenerator.setRootValueSeparator(serializableString);
        }
        return uTF8JsonGenerator;
    }

    public JsonGenerator _createUTF8JsonGenerator(OutputStream outputStream, IOContext iOContext) {
        return _createUTF8Generator(outputStream, iOContext);
    }

    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, IOContext iOContext) {
        if (jsonEncoding == JsonEncoding.UTF8) {
            return new UTF8Writer(iOContext, outputStream);
        }
        return new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    public BufferRecycler _getBufferRecycler() {
        BufferRecycler bufferRecycler;
        SoftReference softReference = (SoftReference) _recyclerRef.get();
        if (softReference == null) {
            bufferRecycler = null;
        } else {
            bufferRecycler = (BufferRecycler) softReference.get();
        }
        if (bufferRecycler != null) {
            return bufferRecycler;
        }
        bufferRecycler = new BufferRecycler();
        _recyclerRef.set(new SoftReference(bufferRecycler));
        return bufferRecycler;
    }

    public InputStream _optimizedStreamFromURL(URL url) {
        if ("file".equals(url.getProtocol())) {
            String host = url.getHost();
            if ((host == null || host.length() == 0) && url.getPath().indexOf(37) < 0) {
                return new FileInputStream(url.getPath());
            }
        }
        return url.openStream();
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        String formatName = getFormatName();
        return formatName != null && formatName.equals(formatSchema.getSchemaType());
    }

    public final JsonFactory configure(Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public final JsonFactory configure(com.fasterxml.jackson.core.JsonGenerator.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public final JsonFactory configure(com.fasterxml.jackson.core.JsonParser.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, null);
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) {
        OutputStream fileOutputStream = new FileOutputStream(file);
        IOContext _createContext = _createContext(fileOutputStream, true);
        _createContext.setEncoding(jsonEncoding);
        OutputDecorator outputDecorator;
        if (jsonEncoding == JsonEncoding.UTF8) {
            outputDecorator = this._outputDecorator;
            if (outputDecorator != null) {
                fileOutputStream = outputDecorator.decorate(_createContext, fileOutputStream);
            }
            return _createUTF8Generator(fileOutputStream, _createContext);
        }
        Writer _createWriter = _createWriter(fileOutputStream, jsonEncoding, _createContext);
        outputDecorator = this._outputDecorator;
        if (outputDecorator != null) {
            _createWriter = outputDecorator.decorate(_createContext, _createWriter);
        }
        return _createGenerator(_createWriter, _createContext);
    }

    public JsonGenerator createGenerator(OutputStream outputStream) {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        IOContext _createContext = _createContext(outputStream, false);
        _createContext.setEncoding(jsonEncoding);
        OutputDecorator outputDecorator;
        if (jsonEncoding == JsonEncoding.UTF8) {
            outputDecorator = this._outputDecorator;
            if (outputDecorator != null) {
                outputStream = outputDecorator.decorate(_createContext, outputStream);
            }
            return _createUTF8Generator(outputStream, _createContext);
        }
        Writer _createWriter = _createWriter(outputStream, jsonEncoding, _createContext);
        outputDecorator = this._outputDecorator;
        if (outputDecorator != null) {
            _createWriter = outputDecorator.decorate(_createContext, _createWriter);
        }
        return _createGenerator(_createWriter, _createContext);
    }

    public JsonGenerator createGenerator(Writer writer) {
        IOContext _createContext = _createContext(writer, false);
        OutputDecorator outputDecorator = this._outputDecorator;
        if (outputDecorator != null) {
            writer = outputDecorator.decorate(_createContext, writer);
        }
        return _createGenerator(writer, _createContext);
    }

    public JsonGenerator createJsonGenerator(File file, JsonEncoding jsonEncoding) {
        return createGenerator(file, jsonEncoding);
    }

    public JsonGenerator createJsonGenerator(OutputStream outputStream) {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    public JsonGenerator createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        return createGenerator(outputStream, jsonEncoding);
    }

    public JsonGenerator createJsonGenerator(Writer writer) {
        return createGenerator(writer);
    }

    public JsonParser createJsonParser(File file) {
        return createParser(file);
    }

    public JsonParser createJsonParser(InputStream inputStream) {
        return createParser(inputStream);
    }

    public JsonParser createJsonParser(Reader reader) {
        return createParser(reader);
    }

    public JsonParser createJsonParser(String str) {
        return createParser(str);
    }

    public JsonParser createJsonParser(URL url) {
        return createParser(url);
    }

    public JsonParser createJsonParser(byte[] bArr) {
        return createParser(bArr);
    }

    public JsonParser createJsonParser(byte[] bArr, int i, int i2) {
        return createParser(bArr, i, i2);
    }

    public JsonParser createParser(File file) {
        IOContext _createContext = _createContext(file, true);
        InputStream fileInputStream = new FileInputStream(file);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            fileInputStream = inputDecorator.decorate(_createContext, fileInputStream);
        }
        return _createParser(fileInputStream, _createContext);
    }

    public JsonParser createParser(InputStream inputStream) {
        IOContext _createContext = _createContext(inputStream, false);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            inputStream = inputDecorator.decorate(_createContext, inputStream);
        }
        return _createParser(inputStream, _createContext);
    }

    public JsonParser createParser(Reader reader) {
        IOContext _createContext = _createContext(reader, false);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            reader = inputDecorator.decorate(_createContext, reader);
        }
        return _createParser(reader, _createContext);
    }

    public JsonParser createParser(String str) {
        Reader stringReader = new StringReader(str);
        IOContext _createContext = _createContext(stringReader, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            stringReader = inputDecorator.decorate(_createContext, stringReader);
        }
        return _createParser(stringReader, _createContext);
    }

    public JsonParser createParser(URL url) {
        IOContext _createContext = _createContext(url, true);
        InputStream _optimizedStreamFromURL = _optimizedStreamFromURL(url);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            _optimizedStreamFromURL = inputDecorator.decorate(_createContext, _optimizedStreamFromURL);
        }
        return _createParser(_optimizedStreamFromURL, _createContext);
    }

    public JsonParser createParser(byte[] bArr) {
        IOContext _createContext = _createContext(bArr, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            InputStream decorate = inputDecorator.decorate(_createContext, bArr, 0, bArr.length);
            if (decorate != null) {
                return _createParser(decorate, _createContext);
            }
        }
        return _createParser(bArr, 0, bArr.length, _createContext);
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) {
        IOContext _createContext = _createContext(bArr, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            InputStream decorate = inputDecorator.decorate(_createContext, bArr, i, i2);
            if (decorate != null) {
                return _createParser(decorate, _createContext);
            }
        }
        return _createParser(bArr, i, i2, _createContext);
    }

    public JsonFactory disable(Feature feature) {
        this._factoryFeatures = (feature.getMask() ^ -1) & this._factoryFeatures;
        return this;
    }

    public JsonFactory disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature) {
        this._generatorFeatures = (feature.getMask() ^ -1) & this._generatorFeatures;
        return this;
    }

    public JsonFactory disable(com.fasterxml.jackson.core.JsonParser.Feature feature) {
        this._parserFeatures = (feature.getMask() ^ -1) & this._parserFeatures;
        return this;
    }

    public JsonFactory enable(Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return this;
    }

    public JsonFactory enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public JsonFactory enable(com.fasterxml.jackson.core.JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public String getFormatName() {
        return getClass() == JsonFactory.class ? FORMAT_NAME_JSON : null;
    }

    public InputDecorator getInputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator getOutputDecorator() {
        return this._outputDecorator;
    }

    public String getRootValueSeparator() {
        SerializableString serializableString = this._rootValueSeparator;
        return serializableString == null ? null : serializableString.getValue();
    }

    public MatchStrength hasFormat(InputAccessor inputAccessor) {
        return getClass() == JsonFactory.class ? hasJSONFormat(inputAccessor) : null;
    }

    public MatchStrength hasJSONFormat(InputAccessor inputAccessor) {
        return ByteSourceJsonBootstrapper.hasJSONFormat(inputAccessor);
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._factoryFeatures) != 0;
    }

    public final boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    public final boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature) {
        return (feature.getMask() & this._parserFeatures) != 0;
    }

    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        return this;
    }

    public JsonFactory setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public JsonFactory setInputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return this;
    }

    public JsonFactory setOutputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return this;
    }

    public JsonFactory setRootValueSeparator(String str) {
        this._rootValueSeparator = str == null ? null : new SerializedString(str);
        return this;
    }

    public Version version() {
        return PackageVersion.VERSION;
    }
}
