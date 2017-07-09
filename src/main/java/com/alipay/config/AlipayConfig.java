package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016080600180370";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCTfYt4yzldOwfxU1c6STm4CLKuDQmlPhI1TB6SyCIVbrAkUr4QUBPltOC2/K1sfQisVbHpAoYZSdOB3zOabPbRF7pbb6JmWhghsfmsxBj/FhNMdvP3lhYSDh2TpcLWMR5ZoB1z1f7NhhkZ2faAxVjPLP3L9LfXO6E88O6LSuWq4Wgj53W1+lv6hIrzrl0Abo6LXTBRl7y2pVdKcMhyo+WdhAhX5MNbUQpPPTRXV5ChvPGOi0ajROsYiTiRxDde2AwCAds/cRV8pvZrWz1WZ0v+Ecg1IGS77kYPMu1NDi2VQ/HlrGCzUqdKuJythRkECg+wMYiSAFN0IWkCAfPOthLbAgMBAAECggEAfZhrLHHiZ4HdQaO2o+u3OwAtKAnyLMSuvLQVVOkYHSgk1smfEEUgrHta4HhLNhdDS32uAr4jc2Vqty1axCYGCAgsqbBmmsIdypPECVrz7kTeKj8hgbRNFxLuHM0LHVq2fZvbeMjCMkH/HgR95SoodkPZ29SIuMAOjdadTAB7kwcJnVQcHfFuYnbJ0eOrR+VD2ExWOtcP7QiYpMV5VficfrDqgFBWLT+tPUJwAvEBrGJIUvK4VAGqj+RusEH0QGMbHC6We8VLFpUI5ShTpZaZOJQK+9I0mNOrAH41DXR2kaY/JoazbM4b+gHExlZ0yNc4daAEInSL6WQiC7quSPVgAQKBgQD7lGGA61y4yKkSe5TF9XVvndNL2R7ws9+vBNqdYQR9e57EgULPUlKhENiKmpJ4GD0fM6mqirg8earAnZF91qrOMpoRav/HvDbgnDwrBa0gDMeauycd4QoXsIBBk2D/e+bUZWmpG4g47kUAbfZ5O9BlHPvvWklOefss1V62EyuvuQKBgQCWFPcDiMrKvIyWqvlPNcJ2IbimyUqn4cdkinBzwBKNKcK6N9SjmxhrBO1DQQWpbggX+32905YVStZBQOR3LC3+/N2TB7D6ipDSUBHkvzZcUDOOSM/0KYhGDqfbOz9dCyPKXB+pjvnzUJJxDhxx1ySF0aEToNly7nq7qUbKoiEZMwKBgERx3A0c+37yaL00jgdFfou9Xo0WJwrJhSOyqF+E05noFgvUNv78oKpdUOx0nUC7J3XjsldJolIhr8jzlW+tBY9PyQbQG4KVvEBjgSMbSjyb/XolTMEeRoanaF1u4UbgyK4kYRi2+tqySGeTgyj8kvfPaON3ptYI7cMG0durX4lRAoGAYhbHrq6r479Bn4OVN/jp5K17cr6ipYDCAesdPfmt5kcB9xVgS6GlXuS0cT1BBxBcB9idwQBV2gq0Z6eS6nSch0gbROpE+CqyJlKgr0FttP3SBE+AYpL2dttDR9y8OAJ83NhC9V317NmfLHbNjnXPcAqnXR3GoQBOhPJIy00VltMCgYBkLVGuiHIoJDMhyO7cr316L7yezfaQOazx1orEQ+U8oJmhTyW+/CpuU5J1pbriUdv3wEeq3N2fJ8VRo1ZJMHcYW45laewrviwlL7F6aRs8LtzlNNHozxH9HkgFelj5mlkOYCEMIIJE+A2PqAUgl5lXSAV/G6TX/6geOZFHjWM49w==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://help.365me.me/views/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://help.365me.me/views/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D：/log";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

