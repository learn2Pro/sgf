# What is `SGF`
*SGF* is a `S`imple Columnar `G`raph `F`ile-format, designed for graph processing system, it used for 
batch/olap graph system; 
* Features:
    * It contained all graph entity and support graph schema descriptor in **json**, so it type-awared, including
     primitive types: int, long, double, boolean, char, byte, TIMESTAMP; also complex types: list, map;
    * The *SGF* builds internal index and aggregate statistics, so it could support efficient predicate pushdown and
     optimized aggregate;
    * The *SGF* support time-traversal in graph 
* our file format like this: ![sgf](https://github.com/learn2Pro/draw_io_save/blob/master/graph/sgf_infr.svg
), inspired by [orc](https://github.com/apache/orc)