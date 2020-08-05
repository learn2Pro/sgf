# What is `SGF`
*SGF* is a `S`imple Columnar `G`raph `F`ile-format, designed for graph processing system, it used for 
batch/olap graph system; It contained all graph entity and support graph schema descriptor in **json**, so
it type-awared, including primitive types: int, long, double, boolean, char, byte; also complex types: list, map;
The *SGF* builds inner index and aggregate statistics, so it could support efficient predicate pushdown and optimized
 aggregate;
 
