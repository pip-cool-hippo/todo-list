INSERT INTO samples (content) values ('Hello World!!');

-- INSERT INTO tasks (title) values ('タスク1');
-- INSERT INTO tasks (title) values ('タスク2');
-- INSERT INTO tasks (title) values ('タスク3');
-- INSERT INTO tasks (title) values ('タスク4');
-- INSERT INTO tasks (title) values ('タスク5');

INSERT INTO tasks (user_id,title,status,emphasis_flg) VALUES ('test1','タイトル1','0','0');
INSERT INTO tasks (user_id,title,status,emphasis_flg) VALUES ('test1','タイトル2','1','1');
INSERT INTO tasks (user_id,title,status,emphasis_flg) VALUES ('test2','タイトル1','0','2');
INSERT INTO tasks (user_id,title,status,emphasis_flg) VALUES ('test2','タイトル2','1','0');
INSERT INTO tasks (user_id,title,status,emphasis_flg) VALUES ('test2','タイトル3','0','1');
INSERT INTO tasks (user_id,title,status,emphasis_flg) VALUES ('test2','タイトル4','1','2');
