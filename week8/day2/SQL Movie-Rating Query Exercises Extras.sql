/*Movie Q1 */
SELECT distinct name FROM rating
left JOIN Movie 
on rating.mID=movie.mId
left join reviewer 
on rating.rid=reviewer.rid
where title like "Gone with the Wind" ;
/*Movie Q2*/ 
SELECT distinct name,title, stars FROM rating
left JOIN Movie 
on rating.mID=movie.mId
left join reviewer 
on rating.rid=reviewer.rid
where name = director;
