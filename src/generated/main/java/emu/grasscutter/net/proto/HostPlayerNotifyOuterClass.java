// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HostPlayerNotify.proto

package emu.grasscutter.net.proto;

public final class HostPlayerNotifyOuterClass {
  private HostPlayerNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HostPlayerNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HostPlayerNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 hostUid = 4;</code>
     * @return The hostUid.
     */
    int getHostUid();

    /**
     * <code>uint32 hostPeerId = 5;</code>
     * @return The hostPeerId.
     */
    int getHostPeerId();
  }
  /**
   * Protobuf type {@code HostPlayerNotify}
   */
  public static final class HostPlayerNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HostPlayerNotify)
      HostPlayerNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HostPlayerNotify.newBuilder() to construct.
    private HostPlayerNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HostPlayerNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HostPlayerNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HostPlayerNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 32: {

              hostUid_ = input.readUInt32();
              break;
            }
            case 40: {

              hostPeerId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.internal_static_HostPlayerNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.internal_static_HostPlayerNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.class, emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code HostPlayerNotify.AJDCLIKNOLN}
     */
    public enum AJDCLIKNOLN
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 387;</code>
       */
      PEPPOHPHJOJ(1, 387),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final AJDCLIKNOLN DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 387;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 387;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static AJDCLIKNOLN valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static AJDCLIKNOLN forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 387: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<AJDCLIKNOLN>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          AJDCLIKNOLN> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AJDCLIKNOLN>() {
              public AJDCLIKNOLN findValueByNumber(int number) {
                return AJDCLIKNOLN.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final AJDCLIKNOLN[] VALUES = getStaticValuesArray();
      private static AJDCLIKNOLN[] getStaticValuesArray() {
        return new AJDCLIKNOLN[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static AJDCLIKNOLN valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private AJDCLIKNOLN(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:HostPlayerNotify.AJDCLIKNOLN)
    }

    public static final int HOSTUID_FIELD_NUMBER = 4;
    private int hostUid_;
    /**
     * <code>uint32 hostUid = 4;</code>
     * @return The hostUid.
     */
    @java.lang.Override
    public int getHostUid() {
      return hostUid_;
    }

    public static final int HOSTPEERID_FIELD_NUMBER = 5;
    private int hostPeerId_;
    /**
     * <code>uint32 hostPeerId = 5;</code>
     * @return The hostPeerId.
     */
    @java.lang.Override
    public int getHostPeerId() {
      return hostPeerId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hostUid_ != 0) {
        output.writeUInt32(4, hostUid_);
      }
      if (hostPeerId_ != 0) {
        output.writeUInt32(5, hostPeerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hostUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, hostUid_);
      }
      if (hostPeerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, hostPeerId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify other = (emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify) obj;

      if (getHostUid()
          != other.getHostUid()) return false;
      if (getHostPeerId()
          != other.getHostPeerId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + HOSTUID_FIELD_NUMBER;
      hash = (53 * hash) + getHostUid();
      hash = (37 * hash) + HOSTPEERID_FIELD_NUMBER;
      hash = (53 * hash) + getHostPeerId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code HostPlayerNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HostPlayerNotify)
        emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.internal_static_HostPlayerNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.internal_static_HostPlayerNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.class, emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        hostUid_ = 0;

        hostPeerId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.internal_static_HostPlayerNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify build() {
        emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify buildPartial() {
        emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify result = new emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify(this);
        result.hostUid_ = hostUid_;
        result.hostPeerId_ = hostPeerId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify other) {
        if (other == emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.getDefaultInstance()) return this;
        if (other.getHostUid() != 0) {
          setHostUid(other.getHostUid());
        }
        if (other.getHostPeerId() != 0) {
          setHostPeerId(other.getHostPeerId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int hostUid_ ;
      /**
       * <code>uint32 hostUid = 4;</code>
       * @return The hostUid.
       */
      @java.lang.Override
      public int getHostUid() {
        return hostUid_;
      }
      /**
       * <code>uint32 hostUid = 4;</code>
       * @param value The hostUid to set.
       * @return This builder for chaining.
       */
      public Builder setHostUid(int value) {
        
        hostUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hostUid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearHostUid() {
        
        hostUid_ = 0;
        onChanged();
        return this;
      }

      private int hostPeerId_ ;
      /**
       * <code>uint32 hostPeerId = 5;</code>
       * @return The hostPeerId.
       */
      @java.lang.Override
      public int getHostPeerId() {
        return hostPeerId_;
      }
      /**
       * <code>uint32 hostPeerId = 5;</code>
       * @param value The hostPeerId to set.
       * @return This builder for chaining.
       */
      public Builder setHostPeerId(int value) {
        
        hostPeerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hostPeerId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearHostPeerId() {
        
        hostPeerId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HostPlayerNotify)
    }

    // @@protoc_insertion_point(class_scope:HostPlayerNotify)
    private static final emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify();
    }

    public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HostPlayerNotify>
        PARSER = new com.google.protobuf.AbstractParser<HostPlayerNotify>() {
      @java.lang.Override
      public HostPlayerNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HostPlayerNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HostPlayerNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HostPlayerNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HostPlayerNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HostPlayerNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026HostPlayerNotify.proto\"\210\001\n\020HostPlayerN" +
      "otify\022\017\n\007hostUid\030\004 \001(\r\022\022\n\nhostPeerId\030\005 \001" +
      "(\r\"O\n\013AJDCLIKNOLN\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJ" +
      "OJ\020\203\003\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032" +
      "\002\020\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HostPlayerNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HostPlayerNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HostPlayerNotify_descriptor,
        new java.lang.String[] { "HostUid", "HostPeerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
