# springcloud-demo
命令调用：
get  localhost:8005/configureTest/get       #clientConfig的get接口
post localhost:8005/actuator/refresh        #clientConfig Refresh接口，更新数据
get  localhost:8003/application-config/dev  #serverConfig获取github上的application-config-dev文件内容
post localhost:8003/actuator/bus-refresh    #serverConfig利用rabbitMQ通知clientConfig更新
get  localhost:8003/actuator/trace          #serverConfig 跟踪总线，获取事件传播细节
    
