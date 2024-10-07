100 rem find prime number
110 n =1
120 c=0
130 i=1
140 if i<=n or (n mod i)<>0 then 300  
145 if i=n and c=2 then 200
150 c=c+1
160 if i>n then 210
170 goto 130

200 Print n + “Prime"
210 c=0
220 n=n+1
230 if c>n then 120
240 goto 130

300 i=i+1
310 goto 140