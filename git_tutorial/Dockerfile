FROM alpine

WORKDIR /git_tutorial

RUN apk --no-cache add ca-certificates && update-ca-certificates && apk --no-cache add git gpg 

COPY ./app ./app

CMD ["git", "version"]
