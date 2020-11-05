INSERT INTO usuarios (username, password, enable, nombre, apellido, email) VALUES ('miguel','123456',1,'miguel','chinchay','miguel@gmail.com');
INSERT INTO usuarios (username, password, enable, nombre, apellido, email) VALUES ('admin','123456',1,'admin','vargas','admin@gmail.com');
INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);