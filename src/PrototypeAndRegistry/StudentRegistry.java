package PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> Registry;
    private StudentRegistry() {
        Registry = new HashMap<>();
    }
  private static StudentRegistry instance=null;
    public static StudentRegistry getInstance() {
        if(instance == null) {
            instance = new StudentRegistry();
        }
        return instance;
    }
    public void register(String key, Student s) {
        Registry.put(key,s);
    }
    public Student get(String key) {
        return Registry.get(key);
    }
}
