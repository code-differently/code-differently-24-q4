--  returns the counts of media items by type.
SELECT 
  type, COUNT(*) AS item_count
FROM 
  media_items
GROUP BY 
  type;

-- returns the sum of total pages checked out by guests.
SELECT 
SUM(pages) AS total_pages
FROM 
guests;

-- shows all 5 guests 
-- and any corresponding records in the checked_out_items table
SELECT 
  guests.id , guests.name , ch.item_id , ch.checkout_date
FROM 
guests 
INNER JOIN checked_out_items ch ON 
;