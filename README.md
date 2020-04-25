# Description

This github action is triggered on every push and provide a syntax check on sql files in that merge request.

# Goal

This action is for educational purpose only and should not be used in production.

In particular I wanted to understand how github actions are created and how to write one that interact with java 

# Sql controls

Check on sql files are done using [JsqlParser](https://github.com/JSQLParser/JSqlParser), in case of problems an output like the following is reported:

	Encountered unexpected token: "rselec" <S_IDENTIFIER>
    at line 1, column 1.
	
	Was expecting one of:
    "("
    ";"
    "ALTER"
    "BEGIN"
    "CALL"
    "COMMENT"
    "COMMIT"
    "CREATE"
	 ...

# Architecture

- openJdk11
- gradle to build java project
- docker
- github action
- github workflow

# How to build

## Java

	gradle build
	
## Docker

	docker build --tag github-action-sql-syntax-check:1.0 .


# Result

Github action seems to be really powerful ( I'm writing this on 04/2020 ) but lack some foundamental documentation on:

- how to use environment variables in steps ( in particular this [problem](https://github.com/actions/starter-workflows/issues/68) and [solution](https://github.com/actions/starter-workflows/issues/68#issuecomment-552074596) using a weird syntax, incredible!)
- lack of basic support on an ide to speed up development
- reference implementation, but lack of explanation on how to glue things together 

**So ask youself before use**: do I really need to dive into this github actions with new yaml system or use another established tools, outside of github ? ( for example Jenkins ?)

# License

Gpl v3
