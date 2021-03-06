package sgg.principle.inversion.improve;

public class DependecyInversion {
    public static void main(String[] args) {
        Email email = new Email();
        Persion persion = new Persion();
        persion.receive(email);

    }
}

interface IReceiver {
    String getInfor();
}

class Email implements IReceiver {
    @Override
    public String getInfor() {
        return "电子邮件信息，hello world";
    }
}

// 完成persion接受消息的功能
// 方式1分析
// 1:简单 比较容易想到
// 2:如果我们获取的获取的对象是为微信短信等，则新增类 persion也要增加相应的接收方法
class Persion {
    public void receive(IReceiver email) {
        System.out.println(email.getInfor());
    }
}
