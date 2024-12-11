x = -10:0.5:10;
y = x.^2
saltCount = 100
for smoothCounter = 0:saltCount
  for index = 1:41
    y(:,index) = y(:,index) + 10 * rand() - 5
  endfor
endfor

plot (x, y);
xlabel ("x");
ylabel ("x^2 Salted");
title ("X^2 Salted 100 times");

