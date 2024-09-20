
import React from 'react'
import GrandChild from './GrandChild';

// Child 컴포넌트에서 받아서 다시 GrandChild컴포넌트로 전달
function Child() {
    return <GrandChild />;
}

export default Child;