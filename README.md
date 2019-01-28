# weweibuy
基于Springboot和SpringCloud模拟电商网站(开发中);使用SpringbootAdmin管理微服务,集成xxl-job分布式任务调度中心;Oauth2+zuul做服务的鉴权与转发
目录结构:
├─weweibuy
│  ├─webuy-admin  -------------------Spring-Boot-Admin微服务管理中心----已完成
│  ├─webuy-auth   -------------------Oauth2 认证授权中心
│  │  ├─webuy-auth-core
│  │  └─webuy-auth-service
│  ├─webuy-backstage
│  ├─webuy-common
│  ├─webuy-eureka   -----------------注册中心 认证授权中心
│  ├─webuy-gateway  -----------------zuul网关代理Oauth2中的资源服务器 认证授权中心
│  ├─webuy-inventory
│  ├─webuy-message  -----------------RabbitMq结合xxl-job基于可靠消息确保服务间数据一致性(待开发)
│  ├─webuy-order
│  ├─webuy-pay
│  ├─webuy-product
│  ├─webuy-search
│  ├─webuy-support
│  │  ├─webuy-support-client
│  │  ├─webuy-support-common
│  │  └─webuy-support-service
│  ├─webuy-task   -----------------Springboot集成xxl-job
│  └─webuy-user
│      ├─webuy-user-client
│      ├─webuy-user-common
│      └─webuy-user-service
