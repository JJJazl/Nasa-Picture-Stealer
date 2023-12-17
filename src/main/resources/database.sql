CREATE TABLE cameras(
    id BIGSERIAL,
    nasa_id BIGINT NOT NULL,
    name TEXT NOT NULL,

    CONSTRAINT cameras_pk PRIMARY KEY(id),
    CONSTRAINT cameras_nasa_id_uq UNIQUE(nasa_id)
);

CREATE TABLE pictures(
    id BIGSERIAL,
    nasa_id BIGINT NOT NULL,
    img_src TEXT NOT NULL,
    camera_id BIGSERIAL NOT NULL,
    created_at DATE NOT NULL,

    CONSTRAINT pictures_pk PRIMARY KEY(id),
    CONSTRAINT pictures_nasa_id_uq UNIQUE(nasa_id),
    CONSTRAINT pictures_cameras_fk FOREIGN KEY(camera_id) REFERENCES cameras(id)
);

CREATE INDEX pictures_camera_id_idx ON pictures(camera_id);