package com.tl.adapter;
/**1:继承
 * 2：组合
 *
 */

/**@Description 真正的适配器 需要连接usb 网线
 * @ClassName Adapter
 * @author wangwei
 * @date 2020/2/16 0016 22:46
 */
public class Adapter extends Adaptee implements NetToUsb {
    @Override
    public void handleRequest() {
        super.request();
    }
}
