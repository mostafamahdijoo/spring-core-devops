CREATE USER 'springframework'@'localhost' IDENTIFIED BY 'guru';

GRANT SELECT ON springguru.* to 'springframework'@'localhost';
GRANT INSERT ON springguru.* to 'springframework'@'localhost';
GRANT DELETE ON springguru.* to 'springframework'@'localhost';
GRANT UPDATE ON springguru.* to 'springframework'@'localhost';


CREATE USER 'qa2'@'localhost' IDENTIFIED BY 'guru';

GRANT SELECT ON qa2.* to 'qa2'@'localhost';
GRANT INSERT ON qa2.* to 'qa2'@'localhost';
GRANT DELETE ON qa2.* to 'qa2'@'localhost';
GRANT UPDATE ON qa2.* to 'qa2'@'localhost';