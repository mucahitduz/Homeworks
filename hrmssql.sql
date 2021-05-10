-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE public."CandidateVerificationCode"
(
    user_id integer NOT NULL,
    candidate_id integer,
    PRIMARY KEY (user_id)
);

CREATE TABLE public."Candidates"
(
    user_id integer NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL,
    identity_number character(11) NOT NULL,
    birthdate date NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public."EmployerVerificationByPersonnel"
(
    user_id integer NOT NULL,
    employer_id integer NOT NULL,
    identity_of_verifiying_personnel integer NOT NULL,
    is_verified boolean NOT NULL,
    verification_date date NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public."EmployerVerificationCode"
(
    user_id integer NOT NULL,
    employer_id integer NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public."Employers"
(
    user_id integer NOT NULL,
    company_name character varying(50) NOT NULL,
    website_adress character varying(50) NOT NULL,
    phone_number character varying(20) NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public."Personnel"
(
    user_id integer NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public."Titles"
(
    id integer NOT NULL,
    job_title character varying(60) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Users"
(
    id integer NOT NULL,
    email character varying(40) NOT NULL,
    password character varying(20) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."VerificationCode"
(
    user_id integer NOT NULL,
    verification_code character varying(15) NOT NULL,
    is_verified boolean NOT NULL,
    verification_date date NOT NULL,
    PRIMARY KEY (user_id)
);

ALTER TABLE public."Employers"
    ADD FOREIGN KEY (user_id)
    REFERENCES public."Users" (id)
    NOT VALID;


ALTER TABLE public."Personnel"
    ADD FOREIGN KEY (user_id)
    REFERENCES public."Users" (id)
    NOT VALID;


ALTER TABLE public."Candidates"
    ADD FOREIGN KEY (user_id)
    REFERENCES public."Users" (id)
    NOT VALID;


ALTER TABLE public."EmployerVerificationByPersonnel"
    ADD FOREIGN KEY (user_id)
    REFERENCES public."Employers" (user_id)
    NOT VALID;


ALTER TABLE public."EmployerVerificationByPersonnel"
    ADD FOREIGN KEY (user_id)
    REFERENCES public."Personnel" (user_id)
    NOT VALID;


ALTER TABLE public."EmployerVerificationCode"
    ADD FOREIGN KEY (user_id)
    REFERENCES public."Employers" (user_id)
    NOT VALID;


ALTER TABLE public."EmployerVerificationCode"
    ADD FOREIGN KEY (user_id)
    REFERENCES public."VerificationCode" (user_id)
    NOT VALID;


ALTER TABLE public."VerificationCode"
    ADD FOREIGN KEY (user_id)
    REFERENCES public."CandidateVerificationCode" (user_id)
    NOT VALID;


ALTER TABLE public."CandidateVerificationCode"
    ADD FOREIGN KEY (user_id)
    REFERENCES public."Candidates" (user_id)
    NOT VALID;

END;