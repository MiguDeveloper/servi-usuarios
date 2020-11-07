INSERT INTO usuarios (username, password, enable, nombre, apellido, email) VALUES ('miguel','$2a$10$TohCqgstl443RalzuUVcc.uVM8y9mheF0o2mJH5IqsSQcj3z.iFsK',1,'miguel','chinchay','miguel@gmail.com');
INSERT INTO usuarios (username, password, enable, nombre, apellido, email) VALUES ('admin','$2a$10$zJp7gJFwGAuLgTuAFJIxGusD.7WvLZ8Q2/Qj4X60EpYhnRupxbejm',1,'admin','vargas','admin@gmail.com');
INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);