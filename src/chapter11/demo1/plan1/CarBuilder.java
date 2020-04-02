package chapter11.demo1.plan1;

import java.util.ArrayList;
// 每个车辆模型都有确定的运行顺序
public abstract class CarBuilder {

    // 建造一个模型。你要给我一个顺序要求，就是组装顺序
    protected abstract void setSequence(ArrayList<String> sequence);

    // 设置完毕后，就可以直接拿到这个车辆模型了
    public abstract CarModel getCarModel();
}
