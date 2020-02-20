package sgg.principle.inversion.improve;

public class DependencyPass {
    public static void main(String[] args) {

    }
}

/*// 方式1 通过接口传递实现依赖
// 开关的接口
interface IOpenAndClose {
    void open(ITV itv);  // 抽象方法  接收接口
}

// ITV接口
interface ITV {
    void play();
}

//实现接口
class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV itv) {
        itv.play();
    }
}*/

/*// 方式2 通过构造方法依赖传递
// 开关的接口
interface IOpenAndClose {
    void open();
}

// ITV接口
interface ITV {
    void play();
}

//实现接口
class OpenAndClose implements IOpenAndClose {

    private ITV itv;

    public OpenAndClose(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
        itv.play();
    }
}*/
// 方式3 通过setter传递
// 开关的接口
interface IOpenAndClose {
    void open();

    void setTv(ITV itv);
}

// ITV接口
interface ITV {
    void play();
}

//实现接口
class OpenAndClose implements IOpenAndClose {

    private ITV itv;


    @Override
    public void open() {
        itv.play();
    }

    @Override
    public void setTv(ITV itv) {
        this.itv = itv;
    }
}
