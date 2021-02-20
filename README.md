# ipv6 测试项目

默认端口号 8080

| 接口地址                   | 接口描述|
|----|----|
|http://ipv6:port           | 不带参数测试|
|http://ip:port/{param}     | 带参数测试|

部署测试
```
docker run -d --name=ipv6-test -p 8080:8080 luoqiz/ipv6-test
```
