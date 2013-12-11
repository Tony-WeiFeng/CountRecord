/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.autodesk.ws.avro;  
@SuppressWarnings("all")
public class SessionMap extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SessionMap\",\"namespace\":\"com.autodesk.ws.avro\",\"fields\":[{\"name\":\"equiv_session_id\",\"type\":\"string\"},{\"name\":\"equiv_session_type\",\"type\":{\"type\":\"enum\",\"name\":\"SessionType\",\"symbols\":[\"SESSION_DESKTOP\",\"SESSION_OXYGEN\",\"SESSION_MOBILE\",\"SESSION_WEB\"]}}]}");
  @Deprecated public java.lang.CharSequence equiv_session_id;
  @Deprecated public com.autodesk.ws.avro.SessionType equiv_session_type;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return equiv_session_id;
    case 1: return equiv_session_type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: equiv_session_id = (java.lang.CharSequence)value$; break;
    case 1: equiv_session_type = (com.autodesk.ws.avro.SessionType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'equiv_session_id' field.
   */
  public java.lang.CharSequence getEquivSessionId() {
    return equiv_session_id;
  }

  /**
   * Sets the value of the 'equiv_session_id' field.
   * @param value the value to set.
   */
  public void setEquivSessionId(java.lang.CharSequence value) {
    this.equiv_session_id = value;
  }

  /**
   * Gets the value of the 'equiv_session_type' field.
   */
  public com.autodesk.ws.avro.SessionType getEquivSessionType() {
    return equiv_session_type;
  }

  /**
   * Sets the value of the 'equiv_session_type' field.
   * @param value the value to set.
   */
  public void setEquivSessionType(com.autodesk.ws.avro.SessionType value) {
    this.equiv_session_type = value;
  }

  /** Creates a new SessionMap RecordBuilder */
  public static com.autodesk.ws.avro.SessionMap.Builder newBuilder() {
    return new com.autodesk.ws.avro.SessionMap.Builder();
  }
  
  /** Creates a new SessionMap RecordBuilder by copying an existing Builder */
  public static com.autodesk.ws.avro.SessionMap.Builder newBuilder(com.autodesk.ws.avro.SessionMap.Builder other) {
    return new com.autodesk.ws.avro.SessionMap.Builder(other);
  }
  
  /** Creates a new SessionMap RecordBuilder by copying an existing SessionMap instance */
  public static com.autodesk.ws.avro.SessionMap.Builder newBuilder(com.autodesk.ws.avro.SessionMap other) {
    return new com.autodesk.ws.avro.SessionMap.Builder(other);
  }
  
  /**
   * RecordBuilder for SessionMap instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SessionMap>
    implements org.apache.avro.data.RecordBuilder<SessionMap> {

    private java.lang.CharSequence equiv_session_id;
    private com.autodesk.ws.avro.SessionType equiv_session_type;

    /** Creates a new Builder */
    private Builder() {
      super(com.autodesk.ws.avro.SessionMap.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.autodesk.ws.avro.SessionMap.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing SessionMap instance */
    private Builder(com.autodesk.ws.avro.SessionMap other) {
            super(com.autodesk.ws.avro.SessionMap.SCHEMA$);
      if (isValidValue(fields()[0], other.equiv_session_id)) {
        this.equiv_session_id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.equiv_session_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.equiv_session_type)) {
        this.equiv_session_type = (com.autodesk.ws.avro.SessionType) data().deepCopy(fields()[1].schema(), other.equiv_session_type);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'equiv_session_id' field */
    public java.lang.CharSequence getEquivSessionId() {
      return equiv_session_id;
    }
    
    /** Sets the value of the 'equiv_session_id' field */
    public com.autodesk.ws.avro.SessionMap.Builder setEquivSessionId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.equiv_session_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'equiv_session_id' field has been set */
    public boolean hasEquivSessionId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'equiv_session_id' field */
    public com.autodesk.ws.avro.SessionMap.Builder clearEquivSessionId() {
      equiv_session_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'equiv_session_type' field */
    public com.autodesk.ws.avro.SessionType getEquivSessionType() {
      return equiv_session_type;
    }
    
    /** Sets the value of the 'equiv_session_type' field */
    public com.autodesk.ws.avro.SessionMap.Builder setEquivSessionType(com.autodesk.ws.avro.SessionType value) {
      validate(fields()[1], value);
      this.equiv_session_type = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'equiv_session_type' field has been set */
    public boolean hasEquivSessionType() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'equiv_session_type' field */
    public com.autodesk.ws.avro.SessionMap.Builder clearEquivSessionType() {
      equiv_session_type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public SessionMap build() {
      try {
        SessionMap record = new SessionMap();
        record.equiv_session_id = fieldSetFlags()[0] ? this.equiv_session_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.equiv_session_type = fieldSetFlags()[1] ? this.equiv_session_type : (com.autodesk.ws.avro.SessionType) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
