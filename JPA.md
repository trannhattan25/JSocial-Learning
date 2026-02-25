| Keyword              | Sample                                      | JPQL snippet                                      |
|----------------------|---------------------------------------------|---------------------------------------------------|
| And                  | findByLastnameAndFirstname                  | where x.lastname = ?1 and x.firstname = ?2       |
| Or                   | findByLastnameOrFirstname                   | where x.lastname = ?1 or x.firstname = ?2        |
| Is, Equals           | findByFirstname, findByFirstnameIs, findByFirstnameEquals | where x.firstname = ?1              |
| Between              | findByStartDateBetween                      | where x.startDate between ?1 and ?2              |
| LessThan             | findByAgeLessThan                           | where x.age < ?1                                 |
| LessThanEqual        | findByAgeLessThanEqual                      | where x.age <= ?1                                |
| GreaterThan          | findByAgeGreaterThan                        | where x.age > ?1                                 |
| GreaterThanEqual     | findByAgeGreaterThanEqual                   | where x.age >= ?1                                |
| After                | findByStartDateAfter                        | where x.startDate > ?1                           |
| Before               | findByStartDateBefore                       | where x.startDate < ?1                           |
| IsNull, Null         | findByAgeIsNull                             | where x.age is null                              |


# JPQL Syntax

## Query

select u from User u

### SQL Syntaxkriterien werden genutzt
and  
or  
<>  
=  
<=  
<>  
( )

select u.name from User u
where (u.age > 18 and u.age <= 65) or u.age = 83

### Erweitert um Objektorientierte Befehle
is empty  
is null  
not  
...