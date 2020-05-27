# ExcelToMySQL
将指定Excel文件导入MySQL数据库

使用SSM框架 +POI实现

（使用前需修改application.yml.example）



### FileController

通过controller层与前端交互，接收excel文件，返回JSON

###### /uploadExcelFile

提交excel文件

###### /getAll

获取所有学生信息



### ExcelReader

读取excel文件，返回java实体类对象



### BasicInformationMapper

控制Mybatis框架完成数据库操作



### ReturnMapHandler

工具类，生成返回Map对象













