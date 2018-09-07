# [Big Countries](https://leetcode.com/problems/big-countries/description/)

**Challenge:** Given the following table `World` 
```
+-----------------+------------+------------+--------------+---------------+
| name            | continent  | area       | population   | gdp           |
+-----------------+------------+------------+--------------+---------------+
| Afghanistan     | Asia       | 652230     | 25500100     | 20343000      |
| Albania         | Europe     | 28748      | 2831741      | 12960000      |
| Algeria         | Africa     | 2381741    | 37100000     | 188681000     |
| Andorra         | Europe     | 468        | 78115        | 3712000       |
| Angola          | Africa     | 1246700    | 20609294     | 100990000     |
+-----------------+------------+------------+--------------+---------------+
```

Write a query to output the big countries' name, population, and area.

A country is considered big if it has an area *larger* than 3 million km<sup>2</sup> or a population *exceeding* 25 million.