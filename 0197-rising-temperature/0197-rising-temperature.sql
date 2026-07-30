# Write your MySQL query statement below
select w.id as Id from Weather w , Weather q where w.temperature>q.temperature and DateDiff(w.recordDate , q.recordDate)=1;