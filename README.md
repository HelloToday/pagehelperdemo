# pagehelperdemo
关于pagehelper的demo
最近测试环境出现了一个诡异的bug 引入了分页插件之后自己手动分页的sql出现了问题

1.搭建了一个简单地mvc项目
2.能够简单地增删改查
3.可以支持分页 以及单元测试

收获：通过写这个demo知道了一些事情，如果用了分页插件，那么你就不要自己再写分页了
否则的话会有正负得负的效果

猜测原理
1.原封不动的替换 from 前面的筛选字段为 select count(0) 之前项目里面的项目出错是因为
select count(0)之后 会跟着一个自己的手动分页mysql原生的分页为limit start,pagesise为 limit 0 offset 10 (从第十条记录开始0条)
显然这样会数组越界
2.问题分析结束