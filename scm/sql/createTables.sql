
###########################
修改时间:		2016-09-07
修改人：		yyf
修改内容：		创建用户表
SQL:     
  
CREATE TABLE `user` (
  `ID` varchar(32) NOT NULL,
  `AGE` varchar(3) DEFAULT NULL,
  `AUDITTIME` date NOT NULL,
  `CREATETIME` date NOT NULL,
  `EMAIL` varchar(20) DEFAULT NULL,
  `IDCARD` varchar(20) DEFAULT NULL,
  `ISVALID` varchar(1) NOT NULL,
  `MOBILEPHONE` varchar(12) NOT NULL,
  `PASSWORD` varchar(15) NOT NULL,
  `SEX` varchar(2) NOT NULL,
  `USERACCOUNT` varchar(20) NOT NULL,
  `USERNAME` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

修改原因：		
是否测试：		本地已测试
是否更新现网：	无
更新现网时间：	无
###########################



