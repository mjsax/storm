/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-9-29")
public class Assignment implements org.apache.thrift.TBase<Assignment, Assignment._Fields>, java.io.Serializable, Cloneable, Comparable<Assignment> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Assignment");

  private static final org.apache.thrift.protocol.TField MASTER_CODE_DIR_FIELD_DESC = new org.apache.thrift.protocol.TField("master_code_dir", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NODE_HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("node_host", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField EXECUTOR_NODE_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("executor_node_port", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField EXECUTOR_START_TIME_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("executor_start_time_secs", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AssignmentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AssignmentTupleSchemeFactory());
  }

  private String master_code_dir; // required
  private Map<String,String> node_host; // optional
  private Map<List<Long>,NodeInfo> executor_node_port; // optional
  private Map<List<Long>,Long> executor_start_time_secs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MASTER_CODE_DIR((short)1, "master_code_dir"),
    NODE_HOST((short)2, "node_host"),
    EXECUTOR_NODE_PORT((short)3, "executor_node_port"),
    EXECUTOR_START_TIME_SECS((short)4, "executor_start_time_secs");

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
        case 1: // MASTER_CODE_DIR
          return MASTER_CODE_DIR;
        case 2: // NODE_HOST
          return NODE_HOST;
        case 3: // EXECUTOR_NODE_PORT
          return EXECUTOR_NODE_PORT;
        case 4: // EXECUTOR_START_TIME_SECS
          return EXECUTOR_START_TIME_SECS;
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
  private static final _Fields optionals[] = {_Fields.NODE_HOST,_Fields.EXECUTOR_NODE_PORT,_Fields.EXECUTOR_START_TIME_SECS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MASTER_CODE_DIR, new org.apache.thrift.meta_data.FieldMetaData("master_code_dir", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NODE_HOST, new org.apache.thrift.meta_data.FieldMetaData("node_host", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.EXECUTOR_NODE_PORT, new org.apache.thrift.meta_data.FieldMetaData("executor_node_port", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NodeInfo.class))));
    tmpMap.put(_Fields.EXECUTOR_START_TIME_SECS, new org.apache.thrift.meta_data.FieldMetaData("executor_start_time_secs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Assignment.class, metaDataMap);
  }

  public Assignment() {
    this.node_host = new HashMap<String,String>();

    this.executor_node_port = new HashMap<List<Long>,NodeInfo>();

    this.executor_start_time_secs = new HashMap<List<Long>,Long>();

  }

  public Assignment(
    String master_code_dir)
  {
    this();
    this.master_code_dir = master_code_dir;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Assignment(Assignment other) {
    if (other.is_set_master_code_dir()) {
      this.master_code_dir = other.master_code_dir;
    }
    if (other.is_set_node_host()) {
      Map<String,String> __this__node_host = new HashMap<String,String>(other.node_host);
      this.node_host = __this__node_host;
    }
    if (other.is_set_executor_node_port()) {
      Map<List<Long>,NodeInfo> __this__executor_node_port = new HashMap<List<Long>,NodeInfo>(other.executor_node_port.size());
      for (Map.Entry<List<Long>, NodeInfo> other_element : other.executor_node_port.entrySet()) {

        List<Long> other_element_key = other_element.getKey();
        NodeInfo other_element_value = other_element.getValue();

        List<Long> __this__executor_node_port_copy_key = new ArrayList<Long>(other_element_key);

        NodeInfo __this__executor_node_port_copy_value = new NodeInfo(other_element_value);

        __this__executor_node_port.put(__this__executor_node_port_copy_key, __this__executor_node_port_copy_value);
      }
      this.executor_node_port = __this__executor_node_port;
    }
    if (other.is_set_executor_start_time_secs()) {
      Map<List<Long>,Long> __this__executor_start_time_secs = new HashMap<List<Long>,Long>(other.executor_start_time_secs.size());
      for (Map.Entry<List<Long>, Long> other_element : other.executor_start_time_secs.entrySet()) {

        List<Long> other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        List<Long> __this__executor_start_time_secs_copy_key = new ArrayList<Long>(other_element_key);

        Long __this__executor_start_time_secs_copy_value = other_element_value;

        __this__executor_start_time_secs.put(__this__executor_start_time_secs_copy_key, __this__executor_start_time_secs_copy_value);
      }
      this.executor_start_time_secs = __this__executor_start_time_secs;
    }
  }

  public Assignment deepCopy() {
    return new Assignment(this);
  }

  @Override
  public void clear() {
    this.master_code_dir = null;
    this.node_host = new HashMap<String,String>();

    this.executor_node_port = new HashMap<List<Long>,NodeInfo>();

    this.executor_start_time_secs = new HashMap<List<Long>,Long>();

  }

  public String get_master_code_dir() {
    return this.master_code_dir;
  }

  public void set_master_code_dir(String master_code_dir) {
    this.master_code_dir = master_code_dir;
  }

  public void unset_master_code_dir() {
    this.master_code_dir = null;
  }

  /** Returns true if field master_code_dir is set (has been assigned a value) and false otherwise */
  public boolean is_set_master_code_dir() {
    return this.master_code_dir != null;
  }

  public void set_master_code_dir_isSet(boolean value) {
    if (!value) {
      this.master_code_dir = null;
    }
  }

  public int get_node_host_size() {
    return (this.node_host == null) ? 0 : this.node_host.size();
  }

  public void put_to_node_host(String key, String val) {
    if (this.node_host == null) {
      this.node_host = new HashMap<String,String>();
    }
    this.node_host.put(key, val);
  }

  public Map<String,String> get_node_host() {
    return this.node_host;
  }

  public void set_node_host(Map<String,String> node_host) {
    this.node_host = node_host;
  }

  public void unset_node_host() {
    this.node_host = null;
  }

  /** Returns true if field node_host is set (has been assigned a value) and false otherwise */
  public boolean is_set_node_host() {
    return this.node_host != null;
  }

  public void set_node_host_isSet(boolean value) {
    if (!value) {
      this.node_host = null;
    }
  }

  public int get_executor_node_port_size() {
    return (this.executor_node_port == null) ? 0 : this.executor_node_port.size();
  }

  public void put_to_executor_node_port(List<Long> key, NodeInfo val) {
    if (this.executor_node_port == null) {
      this.executor_node_port = new HashMap<List<Long>,NodeInfo>();
    }
    this.executor_node_port.put(key, val);
  }

  public Map<List<Long>,NodeInfo> get_executor_node_port() {
    return this.executor_node_port;
  }

  public void set_executor_node_port(Map<List<Long>,NodeInfo> executor_node_port) {
    this.executor_node_port = executor_node_port;
  }

  public void unset_executor_node_port() {
    this.executor_node_port = null;
  }

  /** Returns true if field executor_node_port is set (has been assigned a value) and false otherwise */
  public boolean is_set_executor_node_port() {
    return this.executor_node_port != null;
  }

  public void set_executor_node_port_isSet(boolean value) {
    if (!value) {
      this.executor_node_port = null;
    }
  }

  public int get_executor_start_time_secs_size() {
    return (this.executor_start_time_secs == null) ? 0 : this.executor_start_time_secs.size();
  }

  public void put_to_executor_start_time_secs(List<Long> key, long val) {
    if (this.executor_start_time_secs == null) {
      this.executor_start_time_secs = new HashMap<List<Long>,Long>();
    }
    this.executor_start_time_secs.put(key, val);
  }

  public Map<List<Long>,Long> get_executor_start_time_secs() {
    return this.executor_start_time_secs;
  }

  public void set_executor_start_time_secs(Map<List<Long>,Long> executor_start_time_secs) {
    this.executor_start_time_secs = executor_start_time_secs;
  }

  public void unset_executor_start_time_secs() {
    this.executor_start_time_secs = null;
  }

  /** Returns true if field executor_start_time_secs is set (has been assigned a value) and false otherwise */
  public boolean is_set_executor_start_time_secs() {
    return this.executor_start_time_secs != null;
  }

  public void set_executor_start_time_secs_isSet(boolean value) {
    if (!value) {
      this.executor_start_time_secs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MASTER_CODE_DIR:
      if (value == null) {
        unset_master_code_dir();
      } else {
        set_master_code_dir((String)value);
      }
      break;

    case NODE_HOST:
      if (value == null) {
        unset_node_host();
      } else {
        set_node_host((Map<String,String>)value);
      }
      break;

    case EXECUTOR_NODE_PORT:
      if (value == null) {
        unset_executor_node_port();
      } else {
        set_executor_node_port((Map<List<Long>,NodeInfo>)value);
      }
      break;

    case EXECUTOR_START_TIME_SECS:
      if (value == null) {
        unset_executor_start_time_secs();
      } else {
        set_executor_start_time_secs((Map<List<Long>,Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MASTER_CODE_DIR:
      return get_master_code_dir();

    case NODE_HOST:
      return get_node_host();

    case EXECUTOR_NODE_PORT:
      return get_executor_node_port();

    case EXECUTOR_START_TIME_SECS:
      return get_executor_start_time_secs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MASTER_CODE_DIR:
      return is_set_master_code_dir();
    case NODE_HOST:
      return is_set_node_host();
    case EXECUTOR_NODE_PORT:
      return is_set_executor_node_port();
    case EXECUTOR_START_TIME_SECS:
      return is_set_executor_start_time_secs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Assignment)
      return this.equals((Assignment)that);
    return false;
  }

  public boolean equals(Assignment that) {
    if (that == null)
      return false;

    boolean this_present_master_code_dir = true && this.is_set_master_code_dir();
    boolean that_present_master_code_dir = true && that.is_set_master_code_dir();
    if (this_present_master_code_dir || that_present_master_code_dir) {
      if (!(this_present_master_code_dir && that_present_master_code_dir))
        return false;
      if (!this.master_code_dir.equals(that.master_code_dir))
        return false;
    }

    boolean this_present_node_host = true && this.is_set_node_host();
    boolean that_present_node_host = true && that.is_set_node_host();
    if (this_present_node_host || that_present_node_host) {
      if (!(this_present_node_host && that_present_node_host))
        return false;
      if (!this.node_host.equals(that.node_host))
        return false;
    }

    boolean this_present_executor_node_port = true && this.is_set_executor_node_port();
    boolean that_present_executor_node_port = true && that.is_set_executor_node_port();
    if (this_present_executor_node_port || that_present_executor_node_port) {
      if (!(this_present_executor_node_port && that_present_executor_node_port))
        return false;
      if (!this.executor_node_port.equals(that.executor_node_port))
        return false;
    }

    boolean this_present_executor_start_time_secs = true && this.is_set_executor_start_time_secs();
    boolean that_present_executor_start_time_secs = true && that.is_set_executor_start_time_secs();
    if (this_present_executor_start_time_secs || that_present_executor_start_time_secs) {
      if (!(this_present_executor_start_time_secs && that_present_executor_start_time_secs))
        return false;
      if (!this.executor_start_time_secs.equals(that.executor_start_time_secs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_master_code_dir = true && (is_set_master_code_dir());
    list.add(present_master_code_dir);
    if (present_master_code_dir)
      list.add(master_code_dir);

    boolean present_node_host = true && (is_set_node_host());
    list.add(present_node_host);
    if (present_node_host)
      list.add(node_host);

    boolean present_executor_node_port = true && (is_set_executor_node_port());
    list.add(present_executor_node_port);
    if (present_executor_node_port)
      list.add(executor_node_port);

    boolean present_executor_start_time_secs = true && (is_set_executor_start_time_secs());
    list.add(present_executor_start_time_secs);
    if (present_executor_start_time_secs)
      list.add(executor_start_time_secs);

    return list.hashCode();
  }

  @Override
  public int compareTo(Assignment other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_master_code_dir()).compareTo(other.is_set_master_code_dir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_master_code_dir()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.master_code_dir, other.master_code_dir);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_node_host()).compareTo(other.is_set_node_host());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_node_host()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.node_host, other.node_host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_executor_node_port()).compareTo(other.is_set_executor_node_port());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_executor_node_port()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executor_node_port, other.executor_node_port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_executor_start_time_secs()).compareTo(other.is_set_executor_start_time_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_executor_start_time_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executor_start_time_secs, other.executor_start_time_secs);
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
    StringBuilder sb = new StringBuilder("Assignment(");
    boolean first = true;

    sb.append("master_code_dir:");
    if (this.master_code_dir == null) {
      sb.append("null");
    } else {
      sb.append(this.master_code_dir);
    }
    first = false;
    if (is_set_node_host()) {
      if (!first) sb.append(", ");
      sb.append("node_host:");
      if (this.node_host == null) {
        sb.append("null");
      } else {
        sb.append(this.node_host);
      }
      first = false;
    }
    if (is_set_executor_node_port()) {
      if (!first) sb.append(", ");
      sb.append("executor_node_port:");
      if (this.executor_node_port == null) {
        sb.append("null");
      } else {
        sb.append(this.executor_node_port);
      }
      first = false;
    }
    if (is_set_executor_start_time_secs()) {
      if (!first) sb.append(", ");
      sb.append("executor_start_time_secs:");
      if (this.executor_start_time_secs == null) {
        sb.append("null");
      } else {
        sb.append(this.executor_start_time_secs);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_master_code_dir()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'master_code_dir' is unset! Struct:" + toString());
    }

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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AssignmentStandardSchemeFactory implements SchemeFactory {
    public AssignmentStandardScheme getScheme() {
      return new AssignmentStandardScheme();
    }
  }

  private static class AssignmentStandardScheme extends StandardScheme<Assignment> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Assignment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MASTER_CODE_DIR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.master_code_dir = iprot.readString();
              struct.set_master_code_dir_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NODE_HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map398 = iprot.readMapBegin();
                struct.node_host = new HashMap<String,String>(2*_map398.size);
                String _key399;
                String _val400;
                for (int _i401 = 0; _i401 < _map398.size; ++_i401)
                {
                  _key399 = iprot.readString();
                  _val400 = iprot.readString();
                  struct.node_host.put(_key399, _val400);
                }
                iprot.readMapEnd();
              }
              struct.set_node_host_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXECUTOR_NODE_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map402 = iprot.readMapBegin();
                struct.executor_node_port = new HashMap<List<Long>,NodeInfo>(2*_map402.size);
                List<Long> _key403;
                NodeInfo _val404;
                for (int _i405 = 0; _i405 < _map402.size; ++_i405)
                {
                  {
                    org.apache.thrift.protocol.TList _list406 = iprot.readListBegin();
                    _key403 = new ArrayList<Long>(_list406.size);
                    long _elem407;
                    for (int _i408 = 0; _i408 < _list406.size; ++_i408)
                    {
                      _elem407 = iprot.readI64();
                      _key403.add(_elem407);
                    }
                    iprot.readListEnd();
                  }
                  _val404 = new NodeInfo();
                  _val404.read(iprot);
                  struct.executor_node_port.put(_key403, _val404);
                }
                iprot.readMapEnd();
              }
              struct.set_executor_node_port_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXECUTOR_START_TIME_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map409 = iprot.readMapBegin();
                struct.executor_start_time_secs = new HashMap<List<Long>,Long>(2*_map409.size);
                List<Long> _key410;
                long _val411;
                for (int _i412 = 0; _i412 < _map409.size; ++_i412)
                {
                  {
                    org.apache.thrift.protocol.TList _list413 = iprot.readListBegin();
                    _key410 = new ArrayList<Long>(_list413.size);
                    long _elem414;
                    for (int _i415 = 0; _i415 < _list413.size; ++_i415)
                    {
                      _elem414 = iprot.readI64();
                      _key410.add(_elem414);
                    }
                    iprot.readListEnd();
                  }
                  _val411 = iprot.readI64();
                  struct.executor_start_time_secs.put(_key410, _val411);
                }
                iprot.readMapEnd();
              }
              struct.set_executor_start_time_secs_isSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Assignment struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.master_code_dir != null) {
        oprot.writeFieldBegin(MASTER_CODE_DIR_FIELD_DESC);
        oprot.writeString(struct.master_code_dir);
        oprot.writeFieldEnd();
      }
      if (struct.node_host != null) {
        if (struct.is_set_node_host()) {
          oprot.writeFieldBegin(NODE_HOST_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.node_host.size()));
            for (Map.Entry<String, String> _iter416 : struct.node_host.entrySet())
            {
              oprot.writeString(_iter416.getKey());
              oprot.writeString(_iter416.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.executor_node_port != null) {
        if (struct.is_set_executor_node_port()) {
          oprot.writeFieldBegin(EXECUTOR_NODE_PORT_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.LIST, org.apache.thrift.protocol.TType.STRUCT, struct.executor_node_port.size()));
            for (Map.Entry<List<Long>, NodeInfo> _iter417 : struct.executor_node_port.entrySet())
            {
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, _iter417.getKey().size()));
                for (long _iter418 : _iter417.getKey())
                {
                  oprot.writeI64(_iter418);
                }
                oprot.writeListEnd();
              }
              _iter417.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.executor_start_time_secs != null) {
        if (struct.is_set_executor_start_time_secs()) {
          oprot.writeFieldBegin(EXECUTOR_START_TIME_SECS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.LIST, org.apache.thrift.protocol.TType.I64, struct.executor_start_time_secs.size()));
            for (Map.Entry<List<Long>, Long> _iter419 : struct.executor_start_time_secs.entrySet())
            {
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, _iter419.getKey().size()));
                for (long _iter420 : _iter419.getKey())
                {
                  oprot.writeI64(_iter420);
                }
                oprot.writeListEnd();
              }
              oprot.writeI64(_iter419.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AssignmentTupleSchemeFactory implements SchemeFactory {
    public AssignmentTupleScheme getScheme() {
      return new AssignmentTupleScheme();
    }
  }

  private static class AssignmentTupleScheme extends TupleScheme<Assignment> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Assignment struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.master_code_dir);
      BitSet optionals = new BitSet();
      if (struct.is_set_node_host()) {
        optionals.set(0);
      }
      if (struct.is_set_executor_node_port()) {
        optionals.set(1);
      }
      if (struct.is_set_executor_start_time_secs()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.is_set_node_host()) {
        {
          oprot.writeI32(struct.node_host.size());
          for (Map.Entry<String, String> _iter421 : struct.node_host.entrySet())
          {
            oprot.writeString(_iter421.getKey());
            oprot.writeString(_iter421.getValue());
          }
        }
      }
      if (struct.is_set_executor_node_port()) {
        {
          oprot.writeI32(struct.executor_node_port.size());
          for (Map.Entry<List<Long>, NodeInfo> _iter422 : struct.executor_node_port.entrySet())
          {
            {
              oprot.writeI32(_iter422.getKey().size());
              for (long _iter423 : _iter422.getKey())
              {
                oprot.writeI64(_iter423);
              }
            }
            _iter422.getValue().write(oprot);
          }
        }
      }
      if (struct.is_set_executor_start_time_secs()) {
        {
          oprot.writeI32(struct.executor_start_time_secs.size());
          for (Map.Entry<List<Long>, Long> _iter424 : struct.executor_start_time_secs.entrySet())
          {
            {
              oprot.writeI32(_iter424.getKey().size());
              for (long _iter425 : _iter424.getKey())
              {
                oprot.writeI64(_iter425);
              }
            }
            oprot.writeI64(_iter424.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Assignment struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.master_code_dir = iprot.readString();
      struct.set_master_code_dir_isSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map426 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.node_host = new HashMap<String,String>(2*_map426.size);
          String _key427;
          String _val428;
          for (int _i429 = 0; _i429 < _map426.size; ++_i429)
          {
            _key427 = iprot.readString();
            _val428 = iprot.readString();
            struct.node_host.put(_key427, _val428);
          }
        }
        struct.set_node_host_isSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map430 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.LIST, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.executor_node_port = new HashMap<List<Long>,NodeInfo>(2*_map430.size);
          List<Long> _key431;
          NodeInfo _val432;
          for (int _i433 = 0; _i433 < _map430.size; ++_i433)
          {
            {
              org.apache.thrift.protocol.TList _list434 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
              _key431 = new ArrayList<Long>(_list434.size);
              long _elem435;
              for (int _i436 = 0; _i436 < _list434.size; ++_i436)
              {
                _elem435 = iprot.readI64();
                _key431.add(_elem435);
              }
            }
            _val432 = new NodeInfo();
            _val432.read(iprot);
            struct.executor_node_port.put(_key431, _val432);
          }
        }
        struct.set_executor_node_port_isSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map437 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.LIST, org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.executor_start_time_secs = new HashMap<List<Long>,Long>(2*_map437.size);
          List<Long> _key438;
          long _val439;
          for (int _i440 = 0; _i440 < _map437.size; ++_i440)
          {
            {
              org.apache.thrift.protocol.TList _list441 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
              _key438 = new ArrayList<Long>(_list441.size);
              long _elem442;
              for (int _i443 = 0; _i443 < _list441.size; ++_i443)
              {
                _elem442 = iprot.readI64();
                _key438.add(_elem442);
              }
            }
            _val439 = iprot.readI64();
            struct.executor_start_time_secs.put(_key438, _val439);
          }
        }
        struct.set_executor_start_time_secs_isSet(true);
      }
    }
  }

}

