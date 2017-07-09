※MAVEN※
把支付宝demo 改造成maven 项目


※使用方法※

第一步；git clone "https://github.com/liukefu2050/AlipayDemo.git",项目根目录运行cmd:mvn install,安装支付sdk。

第二步：打开AlipayConfig.java文件，设置请求参数信息并保存，请求参数信息有：app_id、merchant_private_key、alipay_public_key、return_url、notify_url。
bizContent的各个请求参数用法与拼接方式，见文档：https://doc.open.alipay.com/docs/doc.htm?treeId=270&articleId=105899&docType=1

第三步：配置tomcat或jetty,访问index.jsp

第四步：体验支付流程，看效果等。


※业务处理注意事项※

请配置notify_url文件、return_url文件，其中，notify_url文件主要是写入业务处理逻辑代码，请结合自身情况谨慎编写。

如何验证异步通知数据？

1、商户需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号

2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额）

3、校验通知中的seller_id（或者seller_email) 是否为该笔交易对应的操作方（一个商户可能有多个seller_id/seller_email）

4、验证接口调用方的app_id


※说明※

本demo仅仅为学习参考使用，请根据实际情况自行开发，把功能嵌入您的项目或平台中。