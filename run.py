import os
import fileinput

if os.path.exists("log.txt"):
	os.remove("log.txt")
if os.path.exists("log.xml"):
	os.remove("log.xml")
	

os.system("ant build")


os.system("adb push bin/newtest.jar /data/local/tmp/")	


for line in fileinput.input("testsuites.txt"):
	if len(line.strip()) != 0 :
		exeStr = "adb shell uiautomator runtest newtest.jar -c " + line.strip() + " >>log.txt"
	  	os.system(exeStr)  

os.system("java -jar log-converter.jar log.txt")