read -p "Enter your Employee ID : " empId
read -p "Enter your token : " token
echo "connecting....."
request_cmd=$(curl -H -i "Accept:application/json" -X POST -H "Content-Type:application/json" -d'{"empid": $empId}' "http://3.6.235.187:8080/JenkinsTrigger/api/evaluation/$empId/ShoppingCart/java/angular/$token")

echo $request_cmd
s2="Addded EMP ID"
s3="wrong Key passed"
s4="already submitted"
if [ "$request_cmd" == "$s2" ]; then
    curl http://3.6.235.187:8080/JenkinsTrigger/api/employee/submittest/$empId
    echo "connected. Your test has been submitted.
    PRESS ANY KEY TO EXIT"
elif [ "$request_cmd" == "$s3" ]; then
    echo "You have entered wrong credentials!
    PRESS ANY KEY TO EXIT"
elif [ "$request_cmd" == "$s4" ]; then
    echo "Your test has already been submited. You cant submit more than once.
    PRESS ANY KEY TO EXIT"
else
    echo "CONNECTION FAILED !!!!!!!!!!!!!! PLEASE CONTACT ADMINISTRATOR
   PRESS ANY KEY TO EXIT"
fi

sleep 5s
read -n 1 -s
