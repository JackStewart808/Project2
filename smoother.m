x = -10:0.5:10;
y = x.^2
smoothCount = 10
for smoothCounter = 0:smoothCount
  for index = 1:2
    y(:,index) = mean([y(:,1:index+2) y(:,index) * ones(1, 3-index)])
  endfor

  for index = 3:39
    y(:,index) = mean(y(:,index-2:index+2))
  endfor

  for index = 39:41
    y(:,index) = mean(y(:,index-2:41))
  endfor
endfor

plot (x, y);
ylim([0 100])
xlabel ("x");
ylabel ("x^2 Smoothed");
title ("X^2 Smoothed 10 times");

