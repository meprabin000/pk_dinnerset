/*
Author - Karun Dawadi and Prabin Lamichane 
*/
public class MyModelClass {
    private boolean someBoolean;
    private String someStringField;
    private float someExcludedField;
 
    public MyModelClass() {
    }
 
    public MyModelClass(boolean someBoolean, String someStringField, float someExcludedField) {
       super();
       this.someBoolean = someBoolean;
       this.someStringField = someStringField;
       this.someExcludedField = someExcludedField;
    }
 
    @Override
    public String toString() {
       return "MyModelClass [someBoolean=" + someBoolean + ", someStringField=" + someStringField + ", someExcludedField=" + someExcludedField + "]";
    }
 
    @Override
    public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + (someBoolean ? 1231 : 1237);
       result = prime * result + Float.floatToIntBits(someExcludedField);
       result = prime * result + ((someStringField == null) ? 0 : someStringField.hashCode());
       return result;
    }
 
    @Override
    public boolean equals(Object obj) {
       if (this == obj)
          return true;
       if (obj == null)
          return false;
       if (getClass() != obj.getClass())
          return false;
       MyModelClass other = (MyModelClass) obj;
       if (someBoolean != other.someBoolean)
          return false;
       if (Float.floatToIntBits(someExcludedField) != Float.floatToIntBits(other.someExcludedField))
          return false;
       if (someStringField == null) {
          if (other.someStringField != null)
             return false;
       } else if (!someStringField.equals(other.someStringField))
          return false;
       return true;
    }
 
    public boolean getSomeBoolean() {
       return someBoolean;
    }
 
    public void setSomeBoolean(boolean someBoolean) {
       this.someBoolean = someBoolean;
    }
 
    public String getSomeStringField() {
       return someStringField;
    }
 
    public void setSomeStringField(String someStringField) {
       this.someStringField = someStringField;
    }
 
    public float getSomeExcludedField() {
       return someExcludedField;
    }
 
    public void setSomeExcludedField(float someExcludedField) {
       this.someExcludedField = someExcludedField;
    }
 }