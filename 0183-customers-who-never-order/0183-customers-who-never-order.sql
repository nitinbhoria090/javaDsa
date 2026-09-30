select c.name as Customers
from Customers c
where c.id NOT IN (select CustomerId from Orders)

