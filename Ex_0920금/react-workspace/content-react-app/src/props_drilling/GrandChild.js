
import React, {useContext} from 'react'
import {UserContext} from './UserContext'

// GrandChild 컴포넌트에서 이름과 나이 출력하기
function GrandChild() {

    // useContext() 함수를 사용해서
    // UserContext로부터 데이터를 가져온다.
    // user상태와 SetUser 함수를 가져와서 컴포넌트 내에서 사용할 수 있다.
    const {user, SetUser} = useContext(UserContext);

    return (
        <div>
            <h1>{user.name}</h1>
            <p>{user.age}</p>
            <button onClick={() => SetUser({name: 'fdsa', age : 28})}>
                Change User
            </button>
        </div>
    )
}

export default GrandChild;