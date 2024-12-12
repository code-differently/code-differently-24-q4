--  returns the counts of media items by type.
SELECT 
  type, COUNT(*) AS item_count
FROM 
  media_items
GROUP BY 
  type;

-- returns the sum of total pages checked out by guests.
SELECT 
  SUM(media_items.pages) AS total_pages
FROM 
  media_items
  inner join checked_out_items ch on media_items.id = ch.item_id
WHERE
  media_items.pages IS NOT NULL;

-- shows all 5 guests 
-- and any corresponding records in the checked_out_items table
SELECT 
  guests.name , 
  ch.email,
  ch.item_id , 
  ch.due_date
FROM 
  guests 
inner join checked_out_items ch on guests.email = ch.email;