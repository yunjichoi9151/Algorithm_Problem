from datetime import datetime, timedelta
import time

current_time = time.localtime()
now = datetime.now()

if current_time.tm_hour < 15:
    print(str(now)[:10])
else:
    print(str(now + timedelta(days=1))[:10])