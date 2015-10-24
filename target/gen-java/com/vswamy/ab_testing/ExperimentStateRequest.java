/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vswamy.ab_testing;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-24")
public class ExperimentStateRequest implements org.apache.thrift.TBase<ExperimentStateRequest, ExperimentStateRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ExperimentStateRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExperimentStateRequest");

  private static final org.apache.thrift.protocol.TField EXPERIMENT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("experimentName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DEBUG_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("debugInfo", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ExperimentStateRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ExperimentStateRequestTupleSchemeFactory());
  }

  public String experimentName; // required
  public boolean debugInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPERIMENT_NAME((short)1, "experimentName"),
    DEBUG_INFO((short)2, "debugInfo");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EXPERIMENT_NAME
          return EXPERIMENT_NAME;
        case 2: // DEBUG_INFO
          return DEBUG_INFO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DEBUGINFO_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXPERIMENT_NAME, new org.apache.thrift.meta_data.FieldMetaData("experimentName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEBUG_INFO, new org.apache.thrift.meta_data.FieldMetaData("debugInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExperimentStateRequest.class, metaDataMap);
  }

  public ExperimentStateRequest() {
    this.debugInfo = false;

  }

  public ExperimentStateRequest(
    String experimentName,
    boolean debugInfo)
  {
    this();
    this.experimentName = experimentName;
    this.debugInfo = debugInfo;
    setDebugInfoIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExperimentStateRequest(ExperimentStateRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetExperimentName()) {
      this.experimentName = other.experimentName;
    }
    this.debugInfo = other.debugInfo;
  }

  public ExperimentStateRequest deepCopy() {
    return new ExperimentStateRequest(this);
  }

  @Override
  public void clear() {
    this.experimentName = null;
    this.debugInfo = false;

  }

  public String getExperimentName() {
    return this.experimentName;
  }

  public ExperimentStateRequest setExperimentName(String experimentName) {
    this.experimentName = experimentName;
    return this;
  }

  public void unsetExperimentName() {
    this.experimentName = null;
  }

  /** Returns true if field experimentName is set (has been assigned a value) and false otherwise */
  public boolean isSetExperimentName() {
    return this.experimentName != null;
  }

  public void setExperimentNameIsSet(boolean value) {
    if (!value) {
      this.experimentName = null;
    }
  }

  public boolean isDebugInfo() {
    return this.debugInfo;
  }

  public ExperimentStateRequest setDebugInfo(boolean debugInfo) {
    this.debugInfo = debugInfo;
    setDebugInfoIsSet(true);
    return this;
  }

  public void unsetDebugInfo() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DEBUGINFO_ISSET_ID);
  }

  /** Returns true if field debugInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetDebugInfo() {
    return EncodingUtils.testBit(__isset_bitfield, __DEBUGINFO_ISSET_ID);
  }

  public void setDebugInfoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DEBUGINFO_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXPERIMENT_NAME:
      if (value == null) {
        unsetExperimentName();
      } else {
        setExperimentName((String)value);
      }
      break;

    case DEBUG_INFO:
      if (value == null) {
        unsetDebugInfo();
      } else {
        setDebugInfo((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXPERIMENT_NAME:
      return getExperimentName();

    case DEBUG_INFO:
      return Boolean.valueOf(isDebugInfo());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXPERIMENT_NAME:
      return isSetExperimentName();
    case DEBUG_INFO:
      return isSetDebugInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExperimentStateRequest)
      return this.equals((ExperimentStateRequest)that);
    return false;
  }

  public boolean equals(ExperimentStateRequest that) {
    if (that == null)
      return false;

    boolean this_present_experimentName = true && this.isSetExperimentName();
    boolean that_present_experimentName = true && that.isSetExperimentName();
    if (this_present_experimentName || that_present_experimentName) {
      if (!(this_present_experimentName && that_present_experimentName))
        return false;
      if (!this.experimentName.equals(that.experimentName))
        return false;
    }

    boolean this_present_debugInfo = true;
    boolean that_present_debugInfo = true;
    if (this_present_debugInfo || that_present_debugInfo) {
      if (!(this_present_debugInfo && that_present_debugInfo))
        return false;
      if (this.debugInfo != that.debugInfo)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_experimentName = true && (isSetExperimentName());
    list.add(present_experimentName);
    if (present_experimentName)
      list.add(experimentName);

    boolean present_debugInfo = true;
    list.add(present_debugInfo);
    if (present_debugInfo)
      list.add(debugInfo);

    return list.hashCode();
  }

  @Override
  public int compareTo(ExperimentStateRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExperimentName()).compareTo(other.isSetExperimentName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExperimentName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.experimentName, other.experimentName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDebugInfo()).compareTo(other.isSetDebugInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDebugInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.debugInfo, other.debugInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ExperimentStateRequest(");
    boolean first = true;

    sb.append("experimentName:");
    if (this.experimentName == null) {
      sb.append("null");
    } else {
      sb.append(this.experimentName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("debugInfo:");
    sb.append(this.debugInfo);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ExperimentStateRequestStandardSchemeFactory implements SchemeFactory {
    public ExperimentStateRequestStandardScheme getScheme() {
      return new ExperimentStateRequestStandardScheme();
    }
  }

  private static class ExperimentStateRequestStandardScheme extends StandardScheme<ExperimentStateRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExperimentStateRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPERIMENT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.experimentName = iprot.readString();
              struct.setExperimentNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEBUG_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.debugInfo = iprot.readBool();
              struct.setDebugInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExperimentStateRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.experimentName != null) {
        oprot.writeFieldBegin(EXPERIMENT_NAME_FIELD_DESC);
        oprot.writeString(struct.experimentName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DEBUG_INFO_FIELD_DESC);
      oprot.writeBool(struct.debugInfo);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExperimentStateRequestTupleSchemeFactory implements SchemeFactory {
    public ExperimentStateRequestTupleScheme getScheme() {
      return new ExperimentStateRequestTupleScheme();
    }
  }

  private static class ExperimentStateRequestTupleScheme extends TupleScheme<ExperimentStateRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExperimentStateRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExperimentName()) {
        optionals.set(0);
      }
      if (struct.isSetDebugInfo()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetExperimentName()) {
        oprot.writeString(struct.experimentName);
      }
      if (struct.isSetDebugInfo()) {
        oprot.writeBool(struct.debugInfo);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExperimentStateRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.experimentName = iprot.readString();
        struct.setExperimentNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.debugInfo = iprot.readBool();
        struct.setDebugInfoIsSet(true);
      }
    }
  }

}

