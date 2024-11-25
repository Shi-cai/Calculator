package interfaces;

public interface Model extends Basic {
    void fromController(Double[] args);
    void toController(Double[] res);
} 
