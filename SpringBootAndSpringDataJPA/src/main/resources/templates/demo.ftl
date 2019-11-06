<html>
<header>
    <title>
        spring boot
    </title>

</header>

    <body>
        <table border="1px">
            <thead>
            <tr>
                <th>id</th>
                <th>用户名</th>
                <th>密码</th>
                <th>姓名</th>
            </tr>
            </thead>
            <tbody>
                 <#list userList as user>
                 <tr>
                     <th>${user.id}</th>
                     <th>${user.username}</th>
                     <th>${user.password}</th>
                     <th>${user.name}</th>
                 </tr>
                 </#list>
            </tbody>


        </table>

    </body>
</html>