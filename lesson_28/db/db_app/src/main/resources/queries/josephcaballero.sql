--gets all the types and their occurences
SELECT type, COUNT(*) 
FROM media_items
GROUP BY type;

--gets the pages that were checked-out
SELECT pages
FROM media_items 
WHERE id 
IN (SELECT item_id FROM checked_out_items);

--returns the info of an email
SELECT * 
FROM checked_out_items c
WHERE c.email IN (SELECT email FROM guests);





