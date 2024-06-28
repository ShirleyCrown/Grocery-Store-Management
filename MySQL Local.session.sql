SELECT 
    p.product_name,
    id.sold_quantity,
    id.sold_quantity * p.sell_price AS revenue,
    (id.sold_quantity * p.sell_price - id.sold_quantity * p.import_price) AS profit,
    id.report_month
FROM 
    INCOME_DETAILS id
JOIN 
    PRODUCT p ON id.product_id = p.id
WHERE 
    (id.sold_quantity * p.sell_price) = (
        SELECT 
            MAX(id2.sold_quantity * p2.sell_price)
        FROM 
            INCOME_DETAILS id2
        JOIN 
            PRODUCT p2 ON id2.product_id = p2.id
        WHERE 
            id2.report_month = id.report_month
    )
ORDER BY 
    id.report_month;