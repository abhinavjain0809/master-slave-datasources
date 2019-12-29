# A complete guide to setting up Master and Slave (or multiple) Datasources in Spring
A tutorial explaining how to work with multiple datasources in Spring.

Step by step guide here.

## Running this project in local

Run `resources/setup_multiple_datasources.sql` to set up two datasources.

We are using two different databases and not actual master/slave setup in order to show that the data written via our write user config will not be accessible to the read user config. In actual master/slave setup, the data is replicated to the slave in almost real time.

Add data to master DB or DataSource 1:
```curl -X POST \
  http://localhost:8080/books/add \
  -H 'Content-Type: application/json' \
  -d '{
	"name": "Digital Fortress",
	"authorName": "Dan Browm",
	"price": 299.0,
	"genre": "crime",
	"rating": 5
}'
```

Read data from master (DataSource 1)

```curl 'http://localhost:8080/books/find/master'```

This will return the book data that we added using the previous cURL.

Read data from slave (DataSource 2)

```curl 'http://localhost:8080/books/find/slave'```

This will not return any data.
