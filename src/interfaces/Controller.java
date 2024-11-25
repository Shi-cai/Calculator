package interfaces;

public interface Controller extends Basic{
    void fromView(Double[] args);
    void toView(Double[] res);
    void fromModel(Double[] res);
    void toModel(Double[] args);
} 
