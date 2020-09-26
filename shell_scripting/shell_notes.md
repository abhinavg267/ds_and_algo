## Basic shell commands

- ls - `ls [-a, -l, -al] [fileName: optional]`
- mv - `mv [source] [destination]`
- cp - `cp [-ir] [source] [destination]`
    - source can be multiple, but in that case destination needs to be directory
    - use `r` while copying directory, to copy whole directory recursively
    - use `i` to do interactive copy, this will ask user permission for overriding if file with same name already exists, also prints the copying file
    - use `p` to preserve file permissions and owners
- touch - `touch [filename]`
- mkdir - `mkdir [foldername]`
- vi - `vi [filename]`

- which touch 
    - returns `/usr/bin/touch`

- chmod: to change file permission
    - cmds: 
        - `chmod [u, g, o][+, -, =][r, w, x] filename`
        - `chmod [u, g, o][+, -, =][r, w, x] foldername`
            - first block, for whom are we changing the permission for, can select multiple options together
                - `u` owner
                - `g` group
                - `o` other users
            - second block
                - `+` give permission
                - `-` remove permission
                - `=` set permission
            - third block, permissions, can select multiple options together
                - `r` read permission
                - `w` write permission
                - `x` execute permission
                - NOTE: changing permission in numeric code
                    - `0` No Permission
                    - `1` Execute
                    - `2` Write
                    - `4` Read
                - *i.e.* Permission numbers are:
                    - `0` ---
                    - `1` --x
                    - `2` -w-
                    - `3` -wx
                    - `4` r--
                    - `5` r-x
                    - `6` rw-
                    - `7` rwx

    - other similar commands 
        - to change group
            - chgrp groupname filename
            - chgrp groupname foldername
        - to change ownership 
            - chown name filename
            - chown name foldername
   

## Bash script 
- Create a file with any extension with shell commands ex [Test_File](make_files.txt) and run `bash make_files.txt`

- alternatively use `shebang(#!)` to define which interpreter to use, here (`#! /usr/bin/env bash`) and save it as `make_files.sh` file or `make_files` and run `./make_files.sh` or `./make_files` respectively

### Variables 
- VARIABLE_NAME=VALUE
    - *Note* there should be no space in between variable_name and value

- to use a variable append `$` to name, i.e. `$VARIABLE_NAME` will return value of `VARIABLE_NAME`

### Echo and Read 
- echo `echo [-n] [string ...]`
  - `n` is used to not print newline character
  
- read `read [VARIABLE_NAME]`
  - used to read input from shell and store it in `VARIABLE_NAME`

- [Example](hello_world.sh)

### Saving output of a command as variable
- to save output of command `command` wrap it with `$()` or use ``backticks(`)``
- `VARIABLE_NAME = $(command)`
  - eg. `PWD=$(pwd)`

### Command Seperator 
- `newline` is a command_seperator in bash
- we can also use `;` as a command Seperator
  - eg. `echo $PWD; echo $BASH_VERSION`


