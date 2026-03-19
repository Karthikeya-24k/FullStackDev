function ListSystem(){
    const users = ["A","B","C"];
    return (
        <>
        {users.map(
            (user,index) => (
                <div key={index}>{user}</div>
            )
        )
        }
    </>
    );
}
export default ListSystem;