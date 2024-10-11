# 访问地址

### 首页
- [http://localhost:2281/housing/](http://localhost:2281/housing/)

### 门户网站
- [http://localhost:2281/housing/index](http://localhost:2281/housing/index)

### 后台管理页
- [http://localhost:2281/housing/main.html](http://localhost:2281/housing/main.html)

### 后台管理登录页
- [http://localhost:2281/housing/system/toLoginPage](http://localhost:2281/housing/system/toLoginPage)

### Python 服务默认地址端口
- 127.0.0.1:8089


# 账号密码

- 管理员
```yaml
账号: admin
密码: 123456
```

- 住户
```yaml
账号: 李四
密码: 1234
```

> 所有住户密码默认 1234


# 后台功能说明

1. 登录、登出、注册等基本功能。
2. 住户管理；增删改查住户基本信息。
3. 楼宇管理；管理楼栋基本的信息。
4. 房屋管理；新增房屋基本信息【楼宇信息、房型、房号、占地面积等】；可选择出售（绑定户主信息）；户主可选择出租（绑定住户信息）。
5. 车位管理；增删改查车位信息。
6. 员工管理；增删改查员工基本信息（员工主要负责处理投诉、报修等事件单）。
7. 物业收费管理 -> 收费项目管理；增删改查收费项目（名称、单价、描述）。
8. 物业收费管理 -> 抄表管理；根据收费项目对每个房屋进行收费，生成订单；绑定的住户可在前台查看待缴费用单，并进行缴费操作。
9. 物业收费管理 -> 缴费记录查询；查看缴费历史等信息。
10. 车位收费管理；按住户进行收费，绑定车位信息，生成收费单；绑定的住户可在前台查看并进行缴费。
11. 统计分析；含车位收费月度统计、物业收费月度统计。
12. 公告管理；管理员在后台发布公告信息，住户在前台发布公告。
13. 公告评论管理；用户可在前台看到公告信息，并在评论区留言；后台可对评论内容执行【Python情感分析】，生成情感分数、情绪等级、统计图表。
14. 投诉信息管理；用户可在前台发布投诉留言，员工可在后台处理反馈；支持对投诉内容执行【Python情感分析】。
15. 保修信息管理；用户可在前台发起报修单，员工可在后台处理并反馈；支持对报修信息内容执行【Python情感分析】。

# 前台功能说明

1. 登录、登出功能；
2. 物业费查询。住户可查询本人的物业费用清单、并缴费；
3. 车位费查询。住户可查询本人的车位费用清单、并缴费；
4. 公告通知。住户可查询、发布公告，并进行评论；
5. 投诉服务。住户可发起投诉信息，并查看反馈结果；
6. 报修服务。住户可发起报修信息，并查看反馈结果。
