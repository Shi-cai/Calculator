package interfaces;

public interface View extends Basic {
    void fromController(Double[] res);
    void toController(Double[] args);
}
